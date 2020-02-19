package strategy

abstract class Duck {
    abstract var qauckLyamda: () -> Unit
    abstract var quack : QuackBehavior
    fun swim(){
    }
    abstract fun display()
}

class DecoyDuck : Duck(){
    override var qauckLyamda = {}

    override var quack: QuackBehavior = MuteQuack()
    override fun display() {
        println("Displey")
    }

}

class RubberDuck : Duck(){
    override var qauckLyamda = { ->println("ASDF")}
    override var quack: QuackBehavior = Squeak()
    override fun display() {
        println("Rubber")
    }
}

class MallarDuck : Duck(){
    override var qauckLyamda = { ->println("ASDF")}
    override var quack: QuackBehavior = Quack()
    override fun display() {
        println("Mallar")
    }
}
class RedheadDuck : Duck(){
    override var qauckLyamda = { ->println("ASDF")}
    override var quack: QuackBehavior = Quack()
    override fun display() {
        println("Redhead")
    }

}
















