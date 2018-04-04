package net.glebzhebrakov.kfake.random

import net.glebzhebrakov.kfake.random.impl.DefaultRandomTool
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
    companion object {
        fun defaultTools() :  RandomTool = DefaultRandomTool()
    }
}