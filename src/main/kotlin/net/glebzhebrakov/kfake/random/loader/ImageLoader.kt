package net.glebzhebrakov.kfake.random.loader

import java.net.URI

/**
 * Loads image from source.
 */
interface ImageLoader {

    fun loadImage( path: URI ) : ByteArray
}