package info.preva1l.showman.internal

import info.preva1l.showman.BukkitShowman
import info.preva1l.showman.events.Event
import info.preva1l.showman.internal.adapters.event.BukkitEventAdapter
import info.preva1l.showman.subscription.Subscription
import org.bukkit.Bukkit
import org.bukkit.event.EventException
import org.bukkit.event.HandlerList
import java.lang.reflect.InvocationTargetException
import java.util.UUID

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
class BukkitEventBus : EventBus() {
    override fun <T : Event, S : Subscription<T>> complete(subscription: S): S {
        val bukkitEventClass = BukkitShowman.obtain().showmanEventToNativeEventMap[subscription.primaryEventClass()]
            ?: throw IllegalStateException("Couldn't find a mapping for ${subscription.primaryEventClass().simpleName}")

        Bukkit.getPluginManager().registerEvent(
            bukkitEventClass,
            object : ShowmanBukkitListener {
                override fun showmanIdentifier(): UUID = subscription.identifier()
            },
            subscription.priority().bukkit(),
            { _, event ->
                try {
                    if (bukkitEventClass.isAssignableFrom(event.javaClass)) {
                        if (event.javaClass != bukkitEventClass) return@registerEvent
                        @Suppress("UNCHECKED_CAST")
                        val eventAdapter: BukkitEventAdapter<T> =
                            (BukkitShowman.obtain().eventAdapterMap[subscription.primaryEventClass()] as BukkitEventAdapter<T>?)!!
                        val showmanEvent = eventAdapter.adapt(event)
                        subscription.handler().invoke(showmanEvent)
                    }
                } catch (ex: InvocationTargetException) {
                    throw EventException(ex.cause)
                } catch (t: Throwable) {
                    throw EventException(t)
                }
            },
            BukkitShowman.obtain().plugin
        )
        return subscription
    }

    override fun <T : Event> isActive(subscription: Subscription<T>): Boolean {
        val listeners = HandlerList.getRegisteredListeners(BukkitShowman.obtain().plugin)
        for (registeredListener in listeners) {
            val listener = registeredListener.listener
            if (listener !is ShowmanBukkitListener) continue
            if (listener.showmanIdentifier() != subscription.identifier()) continue
            return true
        }
        return false
    }

    override fun <T : Event> unsubscribe(subscription: Subscription<T>) {
        val listeners = HandlerList.getRegisteredListeners(BukkitShowman.obtain().plugin)
        for (registeredListener in listeners) {
            val listener = registeredListener.listener
            if (listener !is ShowmanBukkitListener) continue
            if (listener.showmanIdentifier() != subscription.identifier()) continue
            HandlerList.unregisterAll(listener)
        }
    }
}