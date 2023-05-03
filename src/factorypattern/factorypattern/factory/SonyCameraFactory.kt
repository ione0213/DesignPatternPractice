package factorypattern.factorypattern.factory

import factorypattern.factorypattern.product.Photograph
import factorypattern.factorypattern.product.SonyCamera

object SonyCameraFactory: CameraFactory {
    override fun makeCamera(): Photograph = SonyCamera()
}