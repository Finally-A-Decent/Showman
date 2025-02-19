package info.preva1l.showman

import info.preva1l.showman.events.Event
import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.internal.BukkitEventBus
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
internal class BukkitShowman(
    internal val plugin: JavaPlugin,
    internal val showmanEventToNativeEventMap: MutableMap<Class<out Event>, Class<out org.bukkit.event.Event>> = mutableMapOf(),
) : Showman(BukkitEventBus()) {
    override fun init() {
        showmanEventToNativeEventMap.apply {
            this[PlayerJoinEvent::class.java] = org.bukkit.event.player.PlayerJoinEvent::class.java
        }
    }

    companion object {
        @JvmStatic
        fun obtain(): BukkitShowman = instance as BukkitShowman
    }
}
