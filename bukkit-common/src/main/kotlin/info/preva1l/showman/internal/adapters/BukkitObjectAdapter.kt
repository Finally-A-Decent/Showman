package info.preva1l.showman.internal.adapters

import info.preva1l.showman.models.BukkitBlock
import info.preva1l.showman.models.BukkitPlayer
import info.preva1l.showman.models.Material
import info.preva1l.showman.models.Player
import info.preva1l.showman.models.block.Block
import info.preva1l.showman.models.block.state.BlockState
import info.preva1l.showman.models.world.Environment
import info.preva1l.showman.models.world.World

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
object BukkitObjectAdapter {
    fun adapt(native: org.bukkit.entity.Player): Player = BukkitPlayer(native.name, native.uniqueId)

    fun adapt(native: org.bukkit.block.Block): Block =
        BukkitBlock(
            Material.valueOf(native.type.name),
            adapt(native.world),
            native.x,
            native.y,
            native.z,
        )

    fun adapt(native: org.bukkit.World): World =
        World(
            native.name,
            native.uid,
            Environment.getEnvironment(native.environment.id)
        )

    fun adapt(native: org.bukkit.block.BlockState): BlockState {

    }
}