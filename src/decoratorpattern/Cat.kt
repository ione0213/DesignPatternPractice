package decoratorpattern

/***
 * ConcreteComponent
 */
class Cat(private val name: String): Clean {
    override fun start() {
        println("$name 舔毛 ")
    }
}