package info.preva1l.showman

import info.preva1l.showman.events.Event

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
class Events {
    companion object {
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

        }
    }
}