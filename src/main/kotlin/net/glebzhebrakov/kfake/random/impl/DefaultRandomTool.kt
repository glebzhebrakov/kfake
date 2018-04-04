package net.glebzhebrakov.kfake.random.impl

import net.glebzhebrakov.kfake.random.RandomTool
import java.util.*
import java.util.Random

/**
 * Default implementation of {@link RandomTool}.
 */
class DefaultRandomTool : RandomTool {

    override fun randomInt() : Int = Random().nextInt()

    override fun randomInt( start: Int, end: Int ) : Int {
        require( end > start, { "end must be > start" } )
        require( start >= 0, { "start must be >= 0" } )
        require( end > 0, { "end must be > 0" } )
        return Random().nextInt((end - start) + 1) + start
    }

    override fun randomFloat() : Float = Random().nextFloat()

    override fun randomUUID(): UUID = UUID.randomUUID()

    override fun randomBoolean(): Boolean = Random().nextBoolean()

    override fun randomHexString(): String = Integer.toHexString( Random().nextInt( 256 * 256 * 256 ) )
}