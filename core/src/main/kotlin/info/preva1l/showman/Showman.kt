package info.preva1l.showman

import info.preva1l.showman.internal.EventBus

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
abstract class Showman(
    val eventBus: EventBus,
) {
    protected abstract fun init()

    companion object {
        @JvmStatic
        lateinit var instance: Showman

        @JvmStatic
        fun create(showman: Class<out Showman>) {
            if (this::instance.isInitialized) throw IllegalStateException("Showman has already been initialized")
            this.instance = showman.getDeclaredConstructor().newInstance()
            instance.init()
        }
    }
}