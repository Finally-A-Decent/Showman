package info.preva1l.showman.internal

import org.bukkit.event.Listener
import java.util.UUID

/**
 * Created on 20/02/2025
 *
 * @author Preva1l
 */
interface ShowmanBukkitListener : Listener {
    fun showmanIdentifier(): UUID
}