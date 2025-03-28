package info.preva1l.showman.models.world

import java.util.UUID

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
data class World(
    val name: String,
    val uniqueId: UUID,
    val environment: Environment
)