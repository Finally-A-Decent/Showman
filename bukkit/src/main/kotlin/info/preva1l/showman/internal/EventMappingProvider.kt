package info.preva1l.showman.internal

import info.preva1l.showman.BukkitShowman
import info.preva1l.showman.events.block.BlockBreakEvent
import info.preva1l.showman.events.player.AsyncPlayerPreLoginEvent
import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.internal.adapters.event.BlockEventAdapters
import info.preva1l.showman.internal.adapters.event.PlayerEventAdapters

/**
 * Created on 24/02/2025
 *
 * @author Preva1l
 */
interface EventMappingProvider {
    fun registerEventMappings(sm: BukkitShowman) {
        playerEvents(sm)
        blockEvents(sm)
    }

    private fun playerEvents(sm: BukkitShowman) {
        sm.register(
            PlayerJoinEvent::class.java,
            PlayerEventAdapters.playerJoinEvent(),
            org.bukkit.event.player.PlayerJoinEvent::class.java,
        )

        sm.register(
            AsyncPlayerPreLoginEvent::class.java,
            PlayerEventAdapters.asyncPlayerPreLoginEvent(),
            org.bukkit.event.player.AsyncPlayerPreLoginEvent::class.java,
        )

        sm.register(
            AsyncPlayerPreLoginEvent::class.java,
            PlayerEventAdapters.asyncPlayerPreLoginEvent(),
            org.bukkit.event.player.AsyncPlayerPreLoginEvent::class.java,
        )
    }

    private fun blockEvents(sm: BukkitShowman) {
        sm.register(
            BlockBreakEvent::class.java,
            BlockEventAdapters.blockBreakEvent(),
            org.bukkit.event.block.BlockBreakEvent::class.java,
        )
    }
}