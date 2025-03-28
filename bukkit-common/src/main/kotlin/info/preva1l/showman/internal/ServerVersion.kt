package info.preva1l.showman.internal

import com.google.common.base.Objects
import com.google.common.base.Preconditions
import org.bukkit.Bukkit
import java.util.regex.Pattern

/**
 * Created on 24/02/2025
 *
 * @author Preva1l
 */
@Suppress("unused")
class ServerVersion(
    val major: Int,
    val minor: Int,
    val patch: Int,
    val revision: Double,
    val prerelease: Int,
    val releaseCandidate: Int,
    val isUnknown: Boolean,
    val isTestVersion: Boolean
) : Comparable<ServerVersion> {
    companion object {
        val v1_8_8_R01: ServerVersion = fromString("1.8.8-R0.1-SNAPSHOT") // impl
        val v1_9_R01: ServerVersion = fromString("1.9-R0.1-SNAPSHOT")
        val v1_9_4_R01: ServerVersion = fromString("1.9.4-R0.1-SNAPSHOT")
        val v1_10_2_R01: ServerVersion = fromString("1.10.2-R0.1-SNAPSHOT")
        val v1_11_R01: ServerVersion = fromString("1.11-R0.1-SNAPSHOT")
        val v1_11_2_R01: ServerVersion = fromString("1.11.2-R0.1-SNAPSHOT")
        val v1_12_0_R01: ServerVersion = fromString("1.12.0-R0.1-SNAPSHOT") // impl
        val v1_12_2_R01: ServerVersion = fromString("1.12.2-R0.1-SNAPSHOT")
        val v1_13_0_R01: ServerVersion = fromString("1.13.0-R0.1-SNAPSHOT")
        val v1_13_2_R01: ServerVersion = fromString("1.13.2-R0.1-SNAPSHOT")
        val v1_14_R01: ServerVersion = fromString("1.14-R0.1-SNAPSHOT") // impl
        val v1_14_4_R01: ServerVersion = fromString("1.14.4-R0.1-SNAPSHOT")
        val v1_15_R01: ServerVersion = fromString("1.15-R0.1-SNAPSHOT")
        val v1_15_2_R01: ServerVersion = fromString("1.15.2-R0.1-SNAPSHOT")
        val v1_16_1_R01: ServerVersion = fromString("1.16.1-R0.1-SNAPSHOT")
        val v1_16_5_R01: ServerVersion = fromString("1.16.5-R0.1-SNAPSHOT") // impl
        val v1_17_R01: ServerVersion = fromString("1.17-R0.1-SNAPSHOT")
        val v1_17_1_R01: ServerVersion = fromString("1.17.1-R0.1-SNAPSHOT") // impl
        val v1_18_2_R01: ServerVersion = fromString("1.18.2-R0.1-SNAPSHOT") // impl
        val v1_19_R01: ServerVersion = fromString("1.19-R0.1-SNAPSHOT")
        val v1_19_4_R01: ServerVersion = fromString("1.19.4-R0.1-SNAPSHOT") // impl
        val v1_20_1_R01: ServerVersion = fromString("1.20.1-R0.1-SNAPSHOT")
        val v1_20_4_R01: ServerVersion = fromString("1.20.4-R0.1-SNAPSHOT") // impl
        val v1_20_6_R01: ServerVersion = fromString("1.20.6-R0.1-SNAPSHOT") // impl
        val v1_21_R01: ServerVersion = fromString("1.21-R0.1-SNAPSHOT")
        val v1_21_4_R01: ServerVersion = fromString("1.21.4-R0.1-SNAPSHOT") // impl

        val current: ServerVersion = fromString(Bukkit.getServer().bukkitVersion)

        private val VERSION_PATTERN: Pattern =
            Pattern.compile("^(\\d+)\\.(\\d+)\\.?([0-9]*)?(?:-pre(\\d))?(?:-rc(\\d+))?(?:-?R?([\\d.]+))?(?:-SNAPSHOT)?")

        fun unknown(): ServerVersion = ServerVersion()


        fun fromString(string: String): ServerVersion {
            Preconditions.checkNotNull(string, "string cannot be null.")
            val matcher = VERSION_PATTERN.matcher(string)
            if (!matcher.matches()) return unknown()

            return from(
                matcher.group(1),
                matcher.group(2),
                matcher.group(3),
                matcher.group(6),
                matcher.group(4),
                matcher.group(5)
            )
        }

        private fun from(
            major: String,
            minor: String,
            patch: String?,
            revision: String?,
            preRelease: String?,
            releaseCandidate: String?
        ): ServerVersion {
            var patch = patch
            var revision = revision
            var preRelease = preRelease
            var releaseCandidate = releaseCandidate
            if (patch == null || patch.isEmpty()) patch = "0"
            if (revision == null || revision.isEmpty()) revision = "0"
            if (preRelease == null || preRelease.isEmpty()) preRelease = "-1"
            if (releaseCandidate == null || releaseCandidate.isEmpty()) releaseCandidate = "-1"
            return ServerVersion(
                major.toInt(),
                minor.toInt(),
                patch.toInt(),
                revision.toDouble(),
                preRelease.toInt(),
                releaseCandidate.toInt()
            )
        }
    }

    private constructor(
        major: Int,
        minor: Int,
        patch: Int,
        revision: Double,
        preRelease: Int,
        releaseCandidate: Int
    ) : this(
        major,
        minor,
        patch,
        revision,
        preRelease,
        releaseCandidate,
        false,
        revision == 0.0
    )

    private constructor() : this(
        0,
        0,
        0,
        0.0,
        0,
        0,
        true,
        false
    )

    fun isHigherThan(o: ServerVersion): Boolean {
        return compareTo(o) > 0
    }

    fun isHigherThanOrEqualTo(o: ServerVersion): Boolean {
        return compareTo(o) >= 0
    }

    fun isLowerThan(o: ServerVersion): Boolean {
        return compareTo(o) < 0
    }

    fun isLowerThanOrEqualTo(o: ServerVersion): Boolean {
        return compareTo(o) <= 0
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ServerVersion
        return major == that.major && minor == that.minor && patch == that.patch && revision == that.revision && prerelease == that.prerelease
    }

    override fun hashCode(): Int {
        return Objects.hashCode(
            major, minor, patch, revision,
            prerelease, releaseCandidate
        )
    }

    override fun toString(): String {
        if (this.isUnknown) {
            return "Unknown"
        }
        val sb = StringBuilder("$major.$minor")
        if (patch != 0) {
            sb.append(".").append(patch)
        }
        if (prerelease != -1) {
            sb.append("-pre").append(prerelease)
        }
        if (releaseCandidate != -1) {
            sb.append("-rc").append(releaseCandidate)
        }
        return sb.append("-R").append(revision).toString()
    }

    override fun compareTo(other: ServerVersion): Int {
        return if (major < other.major) {
            -1
        } else if (major > other.major) {
            1
        } else { // equal major
            if (minor < other.minor) {
                -1
            } else if (minor > other.minor) {
                1
            } else { // equal minor
                if (patch < other.patch) {
                    -1
                } else if (patch > other.patch) {
                    1
                } else { // equal patch
                    if (prerelease < other.prerelease) {
                        -1
                    } else if (prerelease > other.prerelease) {
                        1
                    } else { // equal prerelease
                        if (releaseCandidate < other.releaseCandidate) {
                            -1
                        } else if (releaseCandidate > other.releaseCandidate) {
                            1
                        } else { // equal release candidate
                            java.lang.Double.compare(revision, other.revision)
                        }
                    }
                }
            }
        }
    }
}