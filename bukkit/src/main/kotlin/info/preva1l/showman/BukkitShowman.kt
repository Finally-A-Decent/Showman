package info.preva1l.showman

import info.preva1l.showman.events.Event
import info.preva1l.showman.internal.BukkitEventBus
import info.preva1l.showman.internal.EventMappingProvider
import info.preva1l.showman.internal.adapters.event.BukkitEventAdapter
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
class BukkitShowman internal constructor(
    internal val plugin: JavaPlugin,
    internal val showmanEventToNativeEventMap: MutableMap<Class<out Event>, Class<out org.bukkit.event.Event>> = mutableMapOf(),
) : Showman(BukkitEventBus()), EventMappingProvider {
    override fun init() {
        loadLibraries()

        registerEventMappings(this)
    }

    fun register(
        eventClass: Class<out Event>,
        adapterClass: BukkitEventAdapter<*>,
        nativeEventClass: Class<out org.bukkit.event.Event>
    ) {
        showmanEventToNativeEventMap[eventClass] = nativeEventClass
        eventAdapterMap[eventClass] = adapterClass
    }

    companion object {
        @JvmStatic
        fun create(plugin: JavaPlugin) {
            if (isReady()) throw IllegalStateException("Showman has already been initialized")
            instance = BukkitShowman(plugin)
            instance.init()
        }

        @JvmStatic
        fun obtain(): BukkitShowman = instance as BukkitShowman
    }
}
