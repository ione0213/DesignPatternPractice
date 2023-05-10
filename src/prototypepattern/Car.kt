package prototypepattern

class Car(val wheelNumber: Int, val engine: Engine): Cloneable {
    public override fun clone(): Any {
        return super.clone() as Car
    }
}