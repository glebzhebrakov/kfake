package net.glebzhebrakov.kfake.random.provider.impl

import net.glebzhebrakov.kfake.random.loader.impl.HttpImageLoader
import net.glebzhebrakov.kfake.random.provider.RandomImageProvider
import java.net.URI

/**
 * Image provider based on https://picsum.photos/.
 */
class PicsumRandomImageProvider : RandomImageProvider {

    private val PICSUM_URL = "https://picsum.photos/"
    private val httpImageLoader = HttpImageLoader()

    override fun randomImage(): ByteArray = httpImageLoader.loadImage( URI.create( PICSUM_URL ) )

    override fun randomImage(width: Int, height: Int): ByteArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun squareImage(size: Int): ByteArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}