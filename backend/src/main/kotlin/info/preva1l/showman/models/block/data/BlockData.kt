package info.preva1l.showman.models.block.data

import info.preva1l.showman.models.Material
import info.preva1l.showman.models.ShowmanSerializable

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
interface BlockData : ShowmanSerializable<info.preva1l.showman.models.block.data.BlockData> {
    /**
     * Get the Material represented by this block data.
     *
     * @return the material
     */
    fun getMaterial(): Material

}
