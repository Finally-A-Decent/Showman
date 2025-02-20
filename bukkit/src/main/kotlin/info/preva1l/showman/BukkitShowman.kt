package info.preva1l.showman

import info.preva1l.showman.events.Event
import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.internal.BukkitEventBus
import info.preva1l.showman.internal.adapters.event.BukkitEventAdapter
import info.preva1l.showman.internal.adapters.event.PlayerEventAdapters
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
class BukkitShowman internal constructor(
    internal val plugin: JavaPlugin,
    internal val showmanEventToNativeEventMap: MutableMap<Class<out Event>, Class<out org.bukkit.event.Event>> = mutableMapOf(),
) : Showman(BukkitEventBus()) {
    override fun init() {
        register(
            PlayerJoinEvent::class.java,
            PlayerEventAdapters.playerJoinEvent,
            org.bukkit.event.player.PlayerJoinEvent::class.java,
        )
    }

    private fun register(
        eventClass: Class<out Event>,
        adapterClass: BukkitEventAdapter<*>,
        nativeEventClass: Class<out org.bukkit.event.Event>
    ) {
        showmanEventToNativeEventMap[eventClass] = nativeEventClass
        eventAdapterMap[eventClass] = adapterClass
    }

    companion object {
        @JvmStatic
        inline fun <reified S : Showman> create(plugin: JavaPlugin) {
            create(S::class.java, plugin)
        }

        @JvmStatic
        fun create(showman: Class<out Showman>, plugin: JavaPlugin) {
            if (isReady()) throw IllegalStateException("Showman has already been initialized")
            instance = showman.getDeclaredConstructor().newInstance(plugin)
            instance.init()
        }

        @JvmStatic
        fun obtain(): BukkitShowman = instance as BukkitShowman
    }
}
