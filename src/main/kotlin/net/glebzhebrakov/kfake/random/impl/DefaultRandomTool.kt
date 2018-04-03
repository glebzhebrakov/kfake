package net.glebzhebrakov.kfake.random.impl

import net.glebzhebrakov.kfake.random.RandomTool
import java.util.*

/**
 * Default implementation of {@link RandomTool}.
 */
class DefaultRandomTool : RandomTool {

    override fun <T> randomGen(f: () -> T, count: Int) = ( 0 .. count ).map{f()}

    override fun randomInt() : Int = Random().nextInt()

    override fun randomInt( start: Int, end: Int ) : Int {
        require( end > start, { "end must be > start" } )
        require( start >= 0, { "start must be >= 0" } )
        require( end > 0, { "end must be > 0" } )
        return Random().nextInt((end - start) + 1) + start
    }

    override fun randomFloat() : Float = Random().nextFloat()

    override fun randomUUID(): UUID = UUID.randomUUID()


    override fun randomBoolean(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun randomHexString(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Enum<*>> randomEnum(clazz: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}