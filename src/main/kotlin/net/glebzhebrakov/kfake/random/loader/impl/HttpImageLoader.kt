package net.glebzhebrakov.kfake.random.loader.impl

import net.glebzhebrakov.kfake.random.loader.ImageLoader
import java.net.URI

class HttpImageLoader : ImageLoader {

    override fun loadImage( path: URI ): ByteArray  = path.toURL().readBytes()
}