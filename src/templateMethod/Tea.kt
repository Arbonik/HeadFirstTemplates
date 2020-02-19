package templateMethod

class Tea : CaffeineBeverage() {
    override fun brew(){
        println("Step2tea")
    }

    override fun addCondiments() {
        println("Step3tea")
    }

}