package info.preva1l.showman.internal

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.lang.reflect.Method
import java.net.URI
import java.net.URL
import java.net.URLClassLoader
import java.net.URLConnection
import java.nio.channels.Channels
import java.util.logging.Logger
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
object LibraryLoader {
    private val logger: Logger = Logger.getLogger("Libraries")
    private val ADD_URL: Method
    private val CLASS_LOADER: URLClassLoader
    private var FOLDER: File

    init {
        FOLDER = File("libraries")
        if (!FOLDER.exists()) {
            if (FOLDER.mkdirs()) {
                logger.info("Created folder: " + FOLDER.getAbsolutePath())
            }
        }
        val a: Method
        try {
            a = URLClassLoader::class.java.getDeclaredMethod("addURL", URL::class.java)
            a.setAccessible(true)
        } catch (e: NoSuchMethodException) {
            throw RuntimeException(e)
        }
        ADD_URL = a
        CLASS_LOADER = LibraryLoader::class.java.classLoader as URLClassLoader
    }

    private val coordinatesPattern: Pattern = Pattern.compile("^([^: ]+):([^: ]+):([^: ]+)$")

    @JvmOverloads
    fun load(coordinates: String, repository: Repository = Repository.CENTRAL) {
        load(coordinates, repository.url)
    }

    fun load(coordinates: String, repository: String) {
        val matcher: Matcher = coordinatesPattern.matcher(coordinates)
        require(matcher.find()) { "invalid maven coordinates $coordinates" }
        load(repository, matcher.group(1), matcher.group(2), matcher.group(3))
    }

    fun load(repository: String?, groupId: String, artifact: String, version: String) {
        val file = File(FOLDER, "$artifact-$version.jar")
        if (!file.exists()) {
            val url = repository + groupId.replace('.', '/') + String.format(
                "/%1\$s/%2\$s/%1\$s-%2\$s.jar",
                artifact,
                version
            )
            download(file, url)
        }
        try {
            ADD_URL.invoke(CLASS_LOADER, file.toURI().toURL())
        } catch (e: Exception) {
            e.printStackTrace()
        }
        logger.info("Loaded library: $artifact-$version.jar")
    }

    private fun download(file: File, url: String) {
        try {
            val connection: URLConnection = URI(url).toURL().openConnection()

            logger.info("Downloading library: $url")
            connection.getInputStream().use { input ->
                Channels.newChannel(input).use { channel ->
                    FileOutputStream(file).use { outputStream ->
                        outputStream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE)
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    enum class Repository(
        internal val url: String,
    ) {
        CENTRAL("https://repo1.maven.org/maven2/"),
        SONATYPE("https://oss.sonatype.org/content/groups/public/"),
        JITPACK("https://jitpack.io/"),
        FAD("https://repo.preva1l.info/releases")
        ;
    }
}