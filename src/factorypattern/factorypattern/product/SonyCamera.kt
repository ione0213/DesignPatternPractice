package factorypattern.factorypattern.product

class SonyCamera: Photograph {
    override fun shot() {
        println("Sony shot")
    }
}