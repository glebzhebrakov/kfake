package net.glebzhebrakov.kfake.random.provider

import net.glebzhebrakov.kfake.random.provider.impl.PicsumRandomImageProvider

/**
 * Provides wrapper around concrete service to get random images.
 */
interface RandomImageProvider {

    fun randomImage() : ByteArray
    fun randomImage( width: Int, height: Int ) : ByteArray
    fun squareImage( size: Int ) : ByteArray
    companion object {
        fun defaultProvider() : RandomImageProvider = PicsumRandomImageProvider()
    }
}