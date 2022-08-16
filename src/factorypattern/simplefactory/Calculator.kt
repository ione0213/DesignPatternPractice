package factorypattern.simplefactory

fun main() {
    val operatorAdd: Operation = OperationFactory.createOperator(Operator.ADD)
    operatorAdd.apply {
        numA = 1.0
        numB = 3.0
    }.also {
        println("${it.numA} add ${it.numB} = ${it.getResult()}")
    }

    val operatorMinus = OperationFactory.createOperator(Operator.MINUS)
    operatorMinus.apply {
        numA = 9.0
        numB = 11.0
    }.also {
        println("${it.numA} minus ${it.numB} = ${it.getResult()}")
    }
}