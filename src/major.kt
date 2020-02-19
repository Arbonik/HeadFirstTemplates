abstract class Target{
    init {
        start()
    }
    abstract fun name():String
    fun start(){
        while (true){
            var c = readLine()
            if (c == "e")
                break
            else
                println(name())
        }
    }
}

fun main(){
    var b = Bear(object : Target(){
        override fun name(): String {
            return "MALINU"
        }
    })
    b.hunt()
    b.target = TargetFish()
    b.hunt()
    b.target = TargetHuman()
    b.hunt()
    b.sleep = true
    b.hunt()

}

class Bear(t : Target){
    var target = t
    var sleep = false
    fun hunt(){
        if (sleep){
        println("The bear sleep")
        }
        else
        println("The bear kuc' " + target.name())
    }
}

class TargetFish : Target(){
    override fun name(): String {
        return "Fish";
    }
}

class TargetHuman : Target() {
    override fun name(): String {
        return "Human"
    }
}