package factory

abstract class PizzaStore{

    fun orderPizza(type : String): Pizza {
        var pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
    abstract fun createPizza(type : String): Pizza
}

class NYPizzaStore : PizzaStore(){

    override fun createPizza(type: String): Pizza {
            var pizza : Pizza? = null
            when (type){
                "cheese"-> pizza = CheesePizza()
                "clam"-> pizza  = ClamPizza()
                "pepperoni"-> pizza  = PepperoniPizza()
            }
            return pizza!!
    }
}
class ChikagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        var pizza : Pizza? = null
        when (type){
            "cheese"-> pizza = CheesePizza()
            "clam"-> pizza  = ClamPizza()
            "pepperoni"-> pizza  = PepperoniPizza()
        }
        return pizza!!
    }
}
class CaliforniaPizzaStore : PizzaStore(){
    override fun createPizza(type: String): Pizza {
        var pizza : Pizza? = null
        when (type){
            "cheese"-> pizza = CheesePizza()
            "clam"-> pizza  = ClamPizza()
            "pepperoni"-> pizza  = PepperoniPizza()
        }
        return pizza!!
    }
}