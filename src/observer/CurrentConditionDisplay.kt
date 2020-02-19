package observer

import java.util.*

class CurrentConditionDisplay(observable: Observable) : java.util.Observer, DisplayElement {
    var temp : Float = 0.0f
    var hum : Float = 0.0f
    var press : Float = 0.0f
    var observable = Observable()
    init {
        this.observable = observable
        this.observable.addObserver(this)
    }
    override fun update(p0: Observable?, p1: Any?) {
        if (p0 is WeatherData){
            var wd = p0
            this.temp = wd.getTemperature()
            hum = wd.getHumidity()
            press = wd.getPressure()
            displey()
        }
    }
    override fun displey() {
        println("Temp: $temp; Press: $press; Humidity: $hum")
    }
}

class OtherWayDispley(override var sub: Subject) : Observer, DisplayElement {
    var temp : Float = 0.0f
    var hum : Float = 0.0f
    var press : Float = 0.0f

    override fun update(temp : Float, humidity : Float, pressure : Float){
        this.temp = temp
        hum = humidity
        press = pressure
        displey()    }

    override fun displey() {
        println("Temp: $temp; Press: $press; Humidity: $hum")
    }
}

class ForecastDispley(override var sub: Subject) : Observer, DisplayElement {
    override fun update(temp : Float, humidity : Float, pressure : Float){
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun displey() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}