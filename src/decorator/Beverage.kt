package decorator

abstract class Beverage {
    abstract var description : String
    abstract fun cost():Double
    open fun getDescr():String = description
}

class Espresso : Beverage(){
    override var description: String = "Nice decorator.Espresso"
    override fun cost(): Double = 90.0
}

class Decaf : Beverage(){
    override var description: String = "Not so nice like espresso"
    override fun cost(): Double = 180.0
}