package prototypepattern

class Player(val playerName: String, val age: Int, var address: Address): Cloneable {
    public override fun clone(): Any {
        val clonedObj = (super.clone() as Player).also {
            it.address = address.clone() as Address
        }
        return clonedObj
    }
}