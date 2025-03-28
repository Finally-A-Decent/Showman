package info.preva1l.showman.models.block

import info.preva1l.showman.models.Material
import info.preva1l.showman.models.world.World

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
interface Block {
    /**
     * Gets the type of this block
     *
     * @return block type
     */
    fun getType(): Material

    /**
     * Gets the world which contains this Block
     *
     * @return World containing this block
     */
    fun getWorld(): World

    /**
     * Gets the x-coordinate of this block
     *
     * @return x-coordinate
     */
    fun getX(): Int

    /**
     * Gets the y-coordinate of this block
     *
     * @return y-coordinate
     */
    fun getY(): Int

    /**
     * Gets the z-coordinate of this block
     *
     * @return z-coordinate
     */
    fun getZ(): Int
}