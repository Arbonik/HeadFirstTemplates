package templateMethod

abstract class CaffeineBeverage {
    fun prepareRecipe(){
        step1()
        brew()
        if (clientWant())
            addCondiments()
        step4()
    }

    open fun clientWant(): Boolean = true

    fun step1(){
        println("step1")
    }

    abstract fun brew()
    abstract fun addCondiments()

    fun step4(){
        println("step4")
    }

}