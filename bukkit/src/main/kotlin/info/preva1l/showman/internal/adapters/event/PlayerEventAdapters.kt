package info.preva1l.showman.internal.adapters.event

import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.events.player.AsyncPlayerPreLoginEvent
import info.preva1l.showman.internal.adapters.BukkitObjectAdapter
import org.bukkit.event.Event

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
object PlayerEventAdapters {
    fun playerJoinEvent(): BukkitEventAdapter<PlayerJoinEvent> =
        object : BukkitEventAdapter<PlayerJoinEvent> {
            override fun adapt(event: Event): PlayerJoinEvent {
                if (event !is org.bukkit.event.player.PlayerJoinEvent)
                    throw IllegalStateException("Tried to use the PlayerJoinEventAdapter for ${event.eventName}")
                return PlayerJoinEvent(
                    BukkitObjectAdapter.adapt(event.player),
                    event.joinMessage
                )
            }

            override fun fillBukkitEvent(event: PlayerJoinEvent, bukkitEvent: Event) {
                if (bukkitEvent !is org.bukkit.event.player.PlayerJoinEvent)
                    throw IllegalStateException("Tried to use the PlayerJoinEventAdapter for ${bukkitEvent.eventName}")
                bukkitEvent.joinMessage = event.joinMessage
            }
        }

    fun asyncPlayerPreLoginEvent() =
        object : BukkitEventAdapter<AsyncPlayerPreLoginEvent> {
            override fun adapt(event: Event): AsyncPlayerPreLoginEvent {
                if (event !is org.bukkit.event.player.AsyncPlayerPreLoginEvent)
                    throw IllegalStateException("Tried to use the AsyncPlayerPreLoginEventAdapter for ${event.eventName}")
                return AsyncPlayerPreLoginEvent(
                    AsyncPlayerPreLoginEvent.Result.valueOf(event.loginResult.name),
                    event.kickMessage,
                    event.name,
                    event.address,
                    event.uniqueId
                )
            }

            override fun fillBukkitEvent(event: AsyncPlayerPreLoginEvent, bukkitEvent: Event) {
                if (bukkitEvent !is org.bukkit.event.player.AsyncPlayerPreLoginEvent)
                    throw IllegalStateException("Tried to use the AsyncPlayerPreLoginEventAdapter for ${bukkitEvent.eventName}")

                bukkitEvent.kickMessage = event.kickMessage
                bukkitEvent.loginResult = org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result.valueOf(event.loginResult.name)
            }
        }
}