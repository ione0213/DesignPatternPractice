package factorypattern.factorypattern.product

class NikonCamera: Photograph {
    override fun shot() {
        println("Nikon shot")
    }
}