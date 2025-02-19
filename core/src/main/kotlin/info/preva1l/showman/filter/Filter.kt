package info.preva1l.showman.filter

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
@Repeatable
@Target(AnnotationTarget.FUNCTION)
annotation class Filter(
    val value: Filters
)