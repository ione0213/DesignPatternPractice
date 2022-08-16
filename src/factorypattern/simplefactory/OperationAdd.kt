package factorypattern.simplefactory

class OperationAdd: Operation() {

    override fun getResult(): Double = numA + numB
}