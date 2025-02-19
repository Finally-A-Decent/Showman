package info.preva1l.showman.internal

import info.preva1l.showman.BukkitShowman
import info.preva1l.showman.events.Event
import info.preva1l.showman.events.player.PlayerJoinEvent
import info.preva1l.showman.subscription.Subscription
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
class BukkitEventBus : EventBus() {
    override fun <T : Event> post(event: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun <T : Event> isActive(subscription: Subscription<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <T : Event, S : Subscription<T>> complete(subscription: S): S {
        val bukkitEventClass = BukkitShowman.obtain().showmanEventToNativeEventMap[subscription.primaryEventClass()]
            ?: throw IllegalStateException("Couldn't find a mapping for ${subscription.primaryEventClass().simpleName}")

        val listener = object : Listener {
            @EventHandler
            fun on(event: org.bukkit.event.Event) {
                if (event.javaClass != bukkitEventClass) return
                // todo: todo: todo: todo: todo: todo: todo: kill my self
//                val showmanEvent: Event =
//                subscription.handler().invoke(showmanEvent)
            }
        }

//        Bukkit.getPluginManager().registerEvent(
//            bukkitEventClass,
//            listener,
//            subscription.priority().bukkit(),
//
//        )
        return subscription
    }

    override fun <T : Event> unsubscribe(subscription: Subscription<T>) {
        TODO("Not yet implemented")
    }
}