package info.preva1l.showman

import info.preva1l.showman.events.Event
import info.preva1l.showman.subscription.SingleSubscriptionBuilder

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
class Events {
    companion object {
        @JvmStatic
        inline fun <reified T : Event> subscribe(
            order: EventOrder = EventOrder.NORMAL
        ): SingleSubscriptionBuilder<T> {
            return subscribe(T::class.java, order)
        }


        /**
         * Open a subscription to an event class.
         * You add the handler in the next step!
         */
        @JvmStatic
        fun <T : Event> subscribe(
            event: Class<T>,
            order: EventOrder = EventOrder.NORMAL
        ): SingleSubscriptionBuilder<T> {
            return SingleSubscriptionBuilder(event, order)
        }

        /**
         * An alternate way to subscribe to events.
         *
         * To use this alternate subscription method it's very similar to the Velocity & Bukkit API.
         * ```kotlin
         *  class MyPlugin {
         *      init {
         *          LogSentinelEventBus.instance().subscribe(MyEventListener())
         *      }
         *  }
         *
         *  class MyEventListener {
         *      fun on(event: UserLogActionEvent) {
         *          println(event.user.toString())
         *      }
         *  }
         * ```
         */
        @JvmStatic
        fun <T : Event> subscribe(vararg subscribers: Any) {
            Showman.instance.eventBus.subscribe<T>(subscribers)
        }
    }
}