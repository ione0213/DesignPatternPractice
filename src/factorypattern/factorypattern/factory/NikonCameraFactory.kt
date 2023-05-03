package factorypattern.factorypattern.factory

import factorypattern.factorypattern.product.NikonCamera
import factorypattern.factorypattern.product.Photograph

object NikonCameraFactory: CameraFactory {
    override fun makeCamera(): Photograph = NikonCamera()
}