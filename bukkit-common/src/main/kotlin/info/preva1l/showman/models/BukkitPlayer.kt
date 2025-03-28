package info.preva1l.showman.models

import org.bukkit.Bukkit
import java.util.*

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
class BukkitPlayer(
    private val name: String,
    private val uuid: UUID
) : Player {
    override fun name(): String = name
    override fun uniqueId(): UUID = uuid

    override fun sendMessage(message: String) {
        Bukkit.getPlayer(uuid).sendMessage(message)
    }
}