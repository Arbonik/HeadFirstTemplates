package templateMethod

import templateMethod.CaffeineBeverage

class Coffee : CaffeineBeverage() {

    override fun brew(){
        println("Step2cof")
    }
    override fun addCondiments() {
        println("Step3cof")
    }

    override fun clientWant(): Boolean = false

}