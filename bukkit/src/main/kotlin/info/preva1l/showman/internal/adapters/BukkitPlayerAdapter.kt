package info.preva1l.showman.internal.adapters

import info.preva1l.showman.models.BukkitPlayer
import info.preva1l.showman.models.Player

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
object BukkitPlayerAdapter {
    fun adapt(native: org.bukkit.entity.Player): Player = BukkitPlayer(native.name, native.uniqueId)
}