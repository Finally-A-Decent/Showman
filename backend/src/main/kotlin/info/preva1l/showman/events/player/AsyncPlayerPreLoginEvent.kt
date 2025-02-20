package info.preva1l.showman.events.player

import info.preva1l.showman.events.Event
import java.net.InetAddress
import java.util.*

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
class AsyncPlayerPreLoginEvent(
    var loginResult: Result,
    var kickMessage: String,
    val name: String,
    val address: InetAddress,
    val uniqueId: UUID,
) : Event {
    fun allow() {
        this.loginResult = Result.ALLOWED
        this.kickMessage = ""
    }

    fun disallow(result: Result, message: String) {
        this.loginResult = result
        this.kickMessage = message
    }

    enum class Result {
        ALLOWED,
        KICK_FULL,
        KICK_BANNED,
        KICK_WHITELIST,
        KICK_OTHER
        ;
    }
}