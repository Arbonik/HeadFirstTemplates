package strategy

abstract class FlyBehavior {
    abstract fun fly()
}

class FlyNoWay : FlyBehavior(){
    override fun fly() {
    }
}

class FlyWithWings : FlyBehavior(){
    override fun fly() {
    }
}

///////
abstract class QuackBehavior{
    abstract fun quack()
}

class Quack : QuackBehavior(){
    override fun quack() {
        println("QRYAA")
    }
}
class Squeak : QuackBehavior(){
    override fun quack() {
        println("PIIII")
    }
}
class MuteQuack : QuackBehavior(){
    override fun quack() {
    }
}
