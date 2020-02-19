package decorator

abstract class CondimentDecorator : Beverage() {
    abstract var beverage : Beverage
    abstract override var description: String
    abstract var myCost : Double
    override fun getDescr():String{
        return beverage.getDescr() + "\n" + description
    }
    override fun cost(): Double {
        return beverage.cost() + myCost
    }
}