package info.preva1l.showman.internal.adapters.event

import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.internal.adapters.BukkitPlayerAdapter

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
object PlayerEventAdapters {
    val playerJoinEvent = object : BukkitEventAdapter<PlayerJoinEvent> {
        override fun adapt(event: org.bukkit.event.Event): PlayerJoinEvent {
            if (event !is org.bukkit.event.player.PlayerJoinEvent) throw IllegalStateException("Tried to get the PlayerJoinEventAdapter for ${event.eventName}")
            return PlayerJoinEvent(
                BukkitPlayerAdapter.adapt(event.player),
                event.joinMessage
            )
        }
    }
}