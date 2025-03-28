package info.preva1l.showman.internal.adapters.event

import info.preva1l.showman.events.block.BlockBreakEvent
import info.preva1l.showman.internal.ServerVersion
import info.preva1l.showman.internal.adapters.BukkitObjectAdapter
import org.bukkit.event.Event

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
object BlockEventAdapters {
    fun blockBreakEvent(): BukkitEventAdapter<BlockBreakEvent> {
        if (ServerVersion.current.isHigherThanOrEqualTo(ServerVersion.v1_12_0_R01))
            return BlockEventAdapters1_12.blockBreakEvent


        return object : BukkitEventAdapter<BlockBreakEvent> {
            override fun adapt(event: Event): BlockBreakEvent {
                if (event !is org.bukkit.event.block.BlockBreakEvent)
                    throw IllegalStateException("Tried to use the BlockBreakEventAdapter for ${event.eventName}")

                return BlockBreakEvent(
                    BukkitObjectAdapter.adapt(event.player),
                    true,
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
            }
        }
    }
}