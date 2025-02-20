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
class CombinedSubscriptionBuilder<T : Event> internal constructor(
    private val parentClass: Class<T>,
    private val childClasses: MutableList<Class<T>>,
    private var order: EventOrder,
    private var ignoreCancelled: Boolean,
    private val filters: MutableList<(T) -> Boolean> = ArrayList()
) : SubscriptionBuilder<T, CombinedSubscription<T>> {

    override fun handler(handler: (T) -> Unit): CombinedSubscription<T> =
        Showman.instance.eventBus.complete(
            CombinedSubscription(
                parentClass,
                childClasses,
                order,
                filters,
                ignoreCancelled,
                handler
            )
        )

    override fun filter(filter: (T) -> Boolean): CombinedSubscriptionBuilder<T> {
        filters.add(filter)
        return this
    }

    override fun priority(eventOrder: EventOrder): CombinedSubscriptionBuilder<T> {
        order = eventOrder
        return this
    }

    override fun ignoreCancelled(boolean: Boolean): SubscriptionBuilder<T, CombinedSubscription<T>> {
        ignoreCancelled = boolean
        return this
    }
}
