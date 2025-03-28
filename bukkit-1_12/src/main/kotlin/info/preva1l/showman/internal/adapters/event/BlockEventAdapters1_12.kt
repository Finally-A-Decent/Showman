package info.preva1l.showman.internal.adapters.event

import info.preva1l.showman.events.block.BlockBreakEvent
import info.preva1l.showman.internal.adapters.BukkitObjectAdapter
import org.bukkit.event.Event

/**
 * Created on 24/02/2025
 *
 * @author Preva1l
 */
object BlockEventAdapters1_12 {
    var blockBreakEvent = object : BukkitEventAdapter<BlockBreakEvent> {
        override fun adapt(event: Event): BlockBreakEvent {
            if (event !is org.bukkit.event.block.BlockBreakEvent)
                throw IllegalStateException("Tried to use the BlockBreakEventAdapter for ${event.eventName}")

            return BlockBreakEvent(
                BukkitObjectAdapter.adapt(event.player),
                event.isDropItems,
                event.isCancelled,
                event.expToDrop,
                BukkitObjectAdapter.adapt(event.block)
            )
        }

        override fun fillBukkitEvent(event: BlockBreakEvent, bukkitEvent: Event) {
            if (bukkitEvent !is org.bukkit.event.block.BlockBreakEvent)
                throw IllegalStateException("Tried to use the BlockBreakEventAdapter for ${bukkitEvent.eventName}")

            bukkitEvent.isCancelled = event.isCancelled()
            bukkitEvent.expToDrop = event.expToDrop
            bukkitEvent.isDropItems = event.dropItems
        }
    }
}