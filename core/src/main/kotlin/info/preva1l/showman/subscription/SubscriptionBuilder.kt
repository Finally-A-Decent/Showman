package info.preva1l.showman.subscription

import info.preva1l.showman.EventOrder
import info.preva1l.showman.events.Event
import info.preva1l.showman.filter.Filters

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
interface SubscriptionBuilder<T : Event, S : Subscription<T>> {
    fun handler(handler: (T) -> Unit): S

    fun priority(eventOrder: EventOrder): SubscriptionBuilder<T, S>

    fun filter(filter: (T) -> Boolean): SubscriptionBuilder<T, S>

    fun filter(filter: Filters): SubscriptionBuilder<T, S>  = filter(filter.predicate)
}