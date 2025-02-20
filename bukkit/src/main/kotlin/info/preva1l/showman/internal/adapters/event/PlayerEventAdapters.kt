package info.preva1l.showman.internal.adapters.event

import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.internal.adapters.BukkitPlayerAdapter
import org.bukkit.event.Event

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
object PlayerEventAdapters {
    val playerJoinEvent = object : BukkitEventAdapter<PlayerJoinEvent> {
        override fun adapt(event: Event): PlayerJoinEvent {
            if (event !is org.bukkit.event.player.PlayerJoinEvent) throw IllegalStateException("Tried to use the PlayerJoinEventAdapter for ${event.eventName}")
            return PlayerJoinEvent(
                BukkitPlayerAdapter.adapt(event.player),
                event.joinMessage
            )
        }

        override fun fillBukkitEvent(event: PlayerJoinEvent, bukkitEvent: Event) {
            if (bukkitEvent !is org.bukkit.event.player.PlayerJoinEvent) throw IllegalStateException("Tried to use the PlayerJoinEventAdapter for ${bukkitEvent.eventName}")
            bukkitEvent.joinMessage = event.joinMessage
        }
    }
}