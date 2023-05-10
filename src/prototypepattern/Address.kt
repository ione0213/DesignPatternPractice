package prototypepattern

class Address(val zipCode: String, val address: String): Cloneable {
    public override fun clone(): Any {
        return super.clone()
    }
}