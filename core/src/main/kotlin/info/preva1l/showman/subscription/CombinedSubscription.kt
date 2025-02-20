package info.preva1l.showman.subscription

import info.preva1l.showman.EventOrder
import info.preva1l.showman.events.Event
import java.util.*
/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
data class CombinedSubscription<T : Event>(
    private val parentClass: Class<T>,
    val subClasses: List<Class<T>>,
    private val priority: EventOrder,
    private val filters: List<(T) -> Boolean>,
    private val ignoreCancelled: Boolean,
    val handler: (T) -> Unit,
) : Subscription<T> {
    private val identifier: UUID = UUID.randomUUID()
    override fun identifier(): UUID = identifier

    override fun handler(): (T) -> Unit = handler
    override fun primaryEventClass(): Class<out T> = parentClass
    override fun priority(): EventOrder = priority
    override fun filters(): List<(T) -> Boolean> = filters
    override fun ignoreCancelled(): Boolean = ignoreCancelled

    override fun equals(other: Any?): Boolean {
        if (other == null || javaClass != other.javaClass) return false
        val that: CombinedSubscription<*> = other as CombinedSubscription<*>
        return identifier == that.identifier
    }

    override fun hashCode(): Int = Objects.hashCode(identifier)
}