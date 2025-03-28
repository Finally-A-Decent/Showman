package info.preva1l.showman.models

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
interface ShowmanSerializable<T> {
    /**
     * Serializes the object as a json string.
     */
    fun serialize(): String

    /**
     * Deserialize the object from a json string
     */
    fun deserialize(): T
}