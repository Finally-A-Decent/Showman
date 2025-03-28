package info.preva1l.showman.models.world

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
enum class Environment(val id: Int) {
    NORMAL(0),
    NETHER(-1),
    THE_END(1),
    CUSTOM(-999)
    ;

    companion object {
        private val lookup: MutableMap<Int, Environment> = mutableMapOf()

        init {
            for (env: Environment in Environment.entries) {
                lookup[env.id] = env
            }
        }

        /**
         * Get an environment by ID
         *
         * @param id The ID of the environment
         * @return The environment
         */
        fun getEnvironment(id: Int): Environment = lookup[id]!!
    }
}