package info.preva1l.showman.subscription

import info.preva1l.showman.EventOrder
import info.preva1l.showman.Showman
import info.preva1l.showman.events.Event
import info.preva1l.showman.internal.EventBus

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
interface Subscription<T : Event> {
    fun unsubscribe() {
        Showman.instance.eventBus.unsubscribe(this)
    }

    fun isActive(): Boolean {
        return Showman.instance.eventBus.isActive(this)
    }

    fun handler(): (T) -> Unit

    fun primaryEventClass(): Class<out T>

    fun priority(): EventOrder

    fun filters(): List<(T) -> Boolean>
}