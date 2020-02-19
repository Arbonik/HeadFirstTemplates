package factory

abstract class Pizza {
    abstract var name : String
    abstract var sause : String
    abstract var topping : ArrayList<String>


    fun prepare(){
        println("Preparing " + name)
        println("Adding sause")
    }
    fun bake(){
        println("Bake for 25 minutes at 350")
    }
    fun cut(){
        println("Cutting pizza into diagonal slices")
    }
    fun box(){
        println("Place factory.Pizza in official box")
    }

}

class CheesePizza : Pizza(){
    override var topping: ArrayList<String> = arrayListOf()
    override var name: String  = "Cheese"
    override var sause: String = "Tomatoes"
}
class ClamPizza : Pizza(){
    override var topping: ArrayList<String> = arrayListOf()
    override var name: String = "CLAM!!!*#"
    override var sause: String = " Roflan"
}
class PepperoniPizza : Pizza(){
    override var topping: ArrayList<String> = arrayListOf()
    override var name: String = "Peperoni"
    override var sause: String = "Nyam Nyam"
}
