package info.preva1l.showman.models;

import info.preva1l.showman.internal.adapters.BukkitObjectAdapter
import info.preva1l.showman.models.block.Block
import info.preva1l.showman.models.block.state.BlockState
import info.preva1l.showman.models.world.World
import org.bukkit.Bukkit

/**
 * Created on 24/02/2025
 *
 * @author Preva1l
 */
class BukkitBlock(
    private val type: Material,
    private val world: World,
    private val x: Int,
    private val y: Int,
    private val z: Int,
) : Block {
    override fun getType(): Material = type
    override fun getWorld(): World = world
    override fun getX(): Int = x
    override fun getY(): Int = y
    override fun getZ(): Int = z
}
