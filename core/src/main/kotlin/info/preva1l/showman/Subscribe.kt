package info.preva1l.showman

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
@Target(AnnotationTarget.FUNCTION)
annotation class Subscribe(
    val value: EventOrder,
    val ignoreCancelled: Boolean,
)
