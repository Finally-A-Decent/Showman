package info.preva1l.showman.events.block

import info.preva1l.showman.events.Event
import info.preva1l.showman.models.block.Block

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
abstract class BlockEvent(
    val block: Block
) : Event {
}