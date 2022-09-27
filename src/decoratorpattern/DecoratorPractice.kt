package decoratorpattern

fun main() {
    val cat = Cat("圈圈")
    val bath = Bath(cat)
    val brush = Brush(bath)
    val dryer = Dryer(brush)
    dryer.start()

    val cat2 = Cat("呼呼")
    val brush2 = Brush(cat2)
    val bath2 = Bath(brush2)
    val dryer2 = Dryer(bath2)
    dryer2.start()

    val cat3 = Cat("拉拉")
    val dryer3 = Dryer(cat3)
    val brush3 = Brush(dryer3)
    val bath3 = Bath(brush3)
    bath3.start()
}