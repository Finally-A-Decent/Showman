package info.preva1l.showman.internal.adapters.event

import info.preva1l.showman.events.Event

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
interface BukkitEventAdapter<T : Event> : EventAdapter<T> {
    fun adapt(event: org.bukkit.event.Event): T

    fun fillBukkitEvent(event: T, bukkitEvent: org.bukkit.event.Event)
}