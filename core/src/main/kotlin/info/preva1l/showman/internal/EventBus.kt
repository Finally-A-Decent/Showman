package info.preva1l.showman.internal

import info.preva1l.showman.EventOrder
import info.preva1l.showman.Subscribe
import info.preva1l.showman.events.Cancellable
import info.preva1l.showman.events.Event
import info.preva1l.showman.filter.Filter
import info.preva1l.showman.subscription.*
import java.lang.reflect.InvocationTargetException
import java.util.*

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
abstract class EventBus {
    /**
     * Open a subscription to an event class.
     * You add the handler in the next step!
     */
    fun <T : Event> subscribe(
        event: Class<T>,
        order: EventOrder = EventOrder.NORMAL
    ): SingleSubscriptionBuilder<T> {
        return SingleSubscriptionBuilder(event, order)
    }

    fun <T : Event> subscribe(
        parentClass: Class<T>,
        subClasses: MutableList<Class<T>>,
        order: EventOrder = EventOrder.NORMAL
    ): CombinedSubscriptionBuilder<T> {
        return CombinedSubscriptionBuilder(parentClass, subClasses, order)
    }

    fun <T : Event> subscribe(vararg subscribers: Any) {
        for (subscriber in subscribers) {
            val methods = subscriber.javaClass.declaredMethods.also {
                subscriber.javaClass.methods
            }
            for (method in methods) {
                val subscribeAnnotation = method.getAnnotation(Subscribe::class.java)
                if (subscribeAnnotation == null || method.parameterCount != 1) continue
                val filterAnnotations = method.getAnnotationsByType(Filter::class.java) ?: arrayOf()
                val filters = filterAnnotations.map { filterAnnotation -> filterAnnotation.value.predicate }

                method.isAccessible = true
                val paramType = method.parameterTypes[0]

                if (!Event::class.java.isAssignableFrom(paramType)) continue

                val eventClass = paramType as Class<T>

                complete(
                    SingleSubscription(
                        eventClass,
                        subscribeAnnotation.value,
                        filters
                    ) { event: T ->
                        try {
                            method.invoke(subscriber, event)
                        } catch (e: IllegalAccessException) {
                            throw RuntimeException(e)
                        } catch (e: InvocationTargetException) {
                            throw RuntimeException(e)
                        }
                    }
                )
            }
        }
    }

    abstract fun <T : Event> isActive(subscription: Subscription<T>): Boolean

    abstract fun <T : Event, S : Subscription<T>> complete(subscription: S): S

    abstract fun <T : Event> unsubscribe(subscription: Subscription<T>)
}