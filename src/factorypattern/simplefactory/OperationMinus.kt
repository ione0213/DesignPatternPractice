package factorypattern.simplefactory

class OperationMinus: Operation() {
    override fun getResult(): Double =
            numA - numB
}