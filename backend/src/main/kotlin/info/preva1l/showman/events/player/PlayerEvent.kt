package info.preva1l.showman.events.player

import info.preva1l.showman.events.Event
import info.preva1l.showman.models.Player

/**
 * Created on 19/02/2025
 *
 * @author Preva1l
 */
abstract class PlayerEvent(
    val player: Player
) : Event