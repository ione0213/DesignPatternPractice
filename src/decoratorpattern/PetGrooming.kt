package decoratorpattern

/***
 * Decorator
 */
abstract class PetGrooming(private val clean: Clean): Clean {
    override fun start() {
        clean.start()
    }
}