package info.preva1l.showman.models

import java.util.UUID

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
interface Player {
    fun name(): String
    fun uniqueId(): UUID

    fun sendMessage(message: String)
}