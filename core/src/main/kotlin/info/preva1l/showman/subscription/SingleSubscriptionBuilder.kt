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
class SingleSubscriptionBuilder<T : Event> internal constructor(
    private val event: Class<T>,
    private var order: EventOrder,
    private var ignoreCancelled: Boolean = false,
    private val filters: MutableList<(T) -> Boolean> = ArrayList()
) : SubscriptionBuilder<T, SingleSubscription<T>> {

    override fun handler(handler: (T) -> Unit): SingleSubscription<T> =
        Showman.instance.eventBus.complete(
            SingleSubscription(
                event,
                order,
                filters,
                ignoreCancelled,
                handler
            )
        )

    override fun filter(filter: (T) -> Boolean): SingleSubscriptionBuilder<T> {
        filters.add(filter)
        return this
    }

    override fun priority(eventOrder: EventOrder): SingleSubscriptionBuilder<T> {
        order = eventOrder
        return this
    }

    override fun ignoreCancelled(boolean: Boolean): SubscriptionBuilder<T, SingleSubscription<T>> {
        this.ignoreCancelled = boolean
        return this
    }
}
