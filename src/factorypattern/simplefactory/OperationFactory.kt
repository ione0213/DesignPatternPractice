package factorypattern.simplefactory

class OperationFactory {
    companion object {
        fun createOperator(operator: Operator): Operation =
            when (operator) {
                Operator.ADD -> OperationAdd()
                Operator.MINUS -> OperationMinus()
            }
    }
}