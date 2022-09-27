package decoratorpattern

/***
 * Concrete Decorator
 */
class Brush(clean: Clean): PetGrooming(clean) {
    override fun start() {
        super.start()
        brush()
    }

    private fun brush() = println("刷刷刷 ")
}