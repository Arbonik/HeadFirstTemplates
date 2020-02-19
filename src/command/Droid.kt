package command

class Droid  {
    var weapon = 0
    var power = false
    var nightVision = false

    fun display(){
        println("Питание дроида = $power")
        println("Ночное зрение дроида = $nightVision")
        println("Оружие дроида = $weapon")
    }
}