package decoratorpattern

/***
 * Concrete Decorator
 */
class Dryer(clean: Clean): PetGrooming(clean) {
    override fun start() {
        super.start()
        dry()
    }

    private fun dry() = println("吹乾 ")
}