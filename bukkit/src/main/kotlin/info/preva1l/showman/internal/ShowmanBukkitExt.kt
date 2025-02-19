package info.preva1l.showman.internal

import info.preva1l.showman.EventOrder
import org.bukkit.event.Event
import org.bukkit.event.EventPriority
import org.bukkit.event.HandlerList
import org.bukkit.plugin.IllegalPluginAccessException
import org.bukkit.plugin.PluginManager
import java.lang.reflect.Method

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
fun EventOrder.bukkit(): EventPriority {
    return when (this) {
        EventOrder.FIRST -> EventPriority.LOWEST
        EventOrder.EARLY -> EventPriority.LOW
        EventOrder.NORMAL -> EventPriority.NORMAL
        EventOrder.LATE -> EventPriority.HIGH
        EventOrder.LAST -> EventPriority.HIGHEST
        EventOrder.EDIT -> EventPriority.MONITOR
    }
}

fun PluginManager.getEventListeners(type: Class<out Event?>): HandlerList {
    try {
        val method: Method = this.getRegistrationClass(type).getDeclaredMethod("getHandlerList")
        method.isAccessible = true
        return method.invoke(null as Any?) as HandlerList
    } catch (e: Exception) {
        throw IllegalPluginAccessException(e.toString())
    }
}

private fun PluginManager.getRegistrationClass(clazz: Class<out Event>): Class<out Event> {
    try {
        clazz.getDeclaredMethod("getHandlerList")
        return clazz
    } catch (var2: NoSuchMethodException) {
        if (clazz.superclass != null && (clazz.superclass != Event::class.java) && Event::class.java.isAssignableFrom(
                clazz.superclass
            )
        ) {
            return this.getRegistrationClass(clazz.superclass.asSubclass(Event::class.java))
        } else {
            throw IllegalPluginAccessException("Unable to find handler list for event " + clazz.name + ". Static getHandlerList method required!")
        }
    }
}