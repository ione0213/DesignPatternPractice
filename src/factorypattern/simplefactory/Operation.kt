package factorypattern.simplefactory

abstract class Operation {
    var numA: Double = 0.0
    var numB: Double = 0.0

    abstract fun getResult(): Double
}