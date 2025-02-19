package info.preva1l.showman.events

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
interface Cancellable {
    fun setCancelled(cancelled: Boolean)

    fun isCancelled(): Boolean
}