package info.preva1l.showman

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
enum class EventOrder(
    val priority: Int
) {
    FIRST(50),
    EARLY(40),
    NORMAL(30),
    LATE(20),
    LAST(10),
    EDIT(0),
}