package decorator

class Milk(b: Beverage) : CondimentDecorator(){
    override var beverage: Beverage = b
    override var myCost: Double = 20.0
    override var description: String = "Cow meal"
}
class Soy(b: Beverage) : CondimentDecorator(){
    override var description: String = "Add soy"
    override var beverage: Beverage = b
    override var myCost: Double = 10.0
}


class Chocolate(b: Beverage) : CondimentDecorator(){
    override var description: String = "THE REAL GOOD IDEA"
    override var beverage: Beverage = b
    override var myCost: Double = 100.0
}