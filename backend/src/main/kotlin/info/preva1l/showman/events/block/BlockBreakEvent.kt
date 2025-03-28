package info.preva1l.showman.events.block

import info.preva1l.showman.events.Cancellable
import info.preva1l.showman.models.Player
import info.preva1l.showman.models.block.Block

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
class BlockBreakEvent(
    val player: Player,
    var dropItems: Boolean = true,
    private var cancelled: Boolean = false,
    expToDrop: Int,
    block: Block
) : BlockExpEvent(expToDrop, block), Cancellable {
    override fun setCancelled(cancelled: Boolean) {
        this.cancelled = cancelled
    }

    override fun isCancelled(): Boolean = cancelled
}