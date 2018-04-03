package net.glebzhebrakov.kfake.random

import java.util.*

/**
 * Generates random values.
 */
interface RandomTool {
    fun randomInt() : Int
    fun randomInt( start: Int, end: Int ) : Int
    fun randomFloat(): Float
    fun randomUUID() : UUID
    fun randomBoolean() : Boolean
    fun randomHexString() : String
    fun <T : Enum<*>> randomEnum( clazz: Class<T> ): T
    fun <T> randomGen( f : () -> T, count: Int ): List<T>
}