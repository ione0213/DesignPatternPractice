package factorypattern.factorypattern.factory

import factorypattern.factorypattern.product.Photograph

interface CameraFactory {
    fun makeCamera(): Photograph
}