package net.glebzhebrakov.kfake.random.impl

import net.glebzhebrakov.kfake.random.RandomTool
import org.junit.Test
import java.lang.IllegalArgumentException

/**
 * Unit-level test of {@link DefaultRandomTool}.
 */
class DefaultRandomToolUnitTest {

    private val sut = RandomTool.defaultTools()

    @Test
    fun testRandomInt() {
        sut.randomInt()
    }

    @Test
    fun testRandomIntMultipleTimes() {
        val ints = ( 1..100 ).map { sut.randomInt() }
        assert( ints[0] != ints[10] )
    }

    @Test
    fun testRandomIntIntervals() {
        val res = sut.randomInt( 0, 100 )
        assert( res in 0 .. 100 )
    }

    @Test
    fun testRandomIntIntervalsMultiple() {
        ( 1..100 ).forEach {
            val res = sut.randomInt( 0, it )
            assert( res in 0 .. it )
        }
    }

    @Test( expected = IllegalArgumentException::class )
    fun testRandomIntIntervalsWrongIntervals() {
        sut.randomInt( 100, 0 )
    }


    @Test( expected = IllegalArgumentException::class )
    fun testRandomIntIntervalsNegativeStartRange() {
        sut.randomInt( -100, 0 )
    }

    @Test( expected = IllegalArgumentException::class )
    fun testRandomIntIntervalsNegativeEndRange() {
        sut.randomInt( 10, -10 )
    }

    @Test
    fun testRandomFloat() {
        sut.randomFloat()
    }

    @Test
    fun testRandomUUID() {
        sut.randomUUID()
    }

    @Test
    fun testRandomBoolean() {
        sut.randomBoolean()
    }

    @Test
    fun testRandomHexString() {
        ( 1 .. 100 ).forEach {
            val res = sut.randomHexString()
            assert(res.isNotBlank())
        }
    }

}