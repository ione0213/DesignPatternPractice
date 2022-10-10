package proxypattern

class PartBCompany(private val developing: IDeveloping): IDeveloping by developing {
    override fun implement() {
        developing.implement()
        println("Got your requested!")
    }
}