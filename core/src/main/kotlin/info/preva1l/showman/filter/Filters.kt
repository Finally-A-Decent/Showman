package info.preva1l.showman.filter

import info.preva1l.showman.events.Cancellable
import info.preva1l.showman.events.Event

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
enum class Filters(
    val predicate: (Event) -> Boolean
) {
    NOT_CANCELLED({ if (it is Cancellable) it.isCancelled() else false })
}