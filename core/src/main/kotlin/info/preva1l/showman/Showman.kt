package info.preva1l.showman

import info.preva1l.showman.events.Event
import info.preva1l.showman.internal.EventBus
import info.preva1l.showman.internal.adapters.event.EventAdapter

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
abstract class Showman(
    val eventBus: EventBus,
    val eventAdapterMap: MutableMap<Class<*>, EventAdapter<out Event>> = mutableMapOf(),
) {
    abstract fun init()

    companion object {
        @JvmStatic
        lateinit var instance: Showman

        fun isReady(): Boolean = this::instance.isInitialized
    }
}