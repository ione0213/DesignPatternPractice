package decoratorpattern

/***
 * Concrete Decorator
 */
class Bath(clean: Clean): PetGrooming(clean) {
    override fun start() {
        super.start()
        shower()
    }

    private fun shower() = println("洗澡 ")
}