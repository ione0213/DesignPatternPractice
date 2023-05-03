package factorypattern.factorypattern

import factorypattern.factorypattern.factory.NikonCameraFactory
import factorypattern.factorypattern.factory.SonyCameraFactory
import factorypattern.factorypattern.product.Photograph

fun main() {
    val nikonCamera: Photograph = NikonCameraFactory.makeCamera()
    nikonCamera.shot()

    val sonyCamera: Photograph = SonyCameraFactory.makeCamera()
    sonyCamera.shot()
}