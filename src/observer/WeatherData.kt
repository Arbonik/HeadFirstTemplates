package observer

import java.util.*
import kotlin.random.Random

class WeatherData : Observable() {
    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F
    fun getTemperature(): Float{
        return temperature
    }
    fun getHumidity() : Float{
        return humidity
    }
    fun getPressure() : Float{
        return pressure
    }
    fun measurementsChanged(){
        setChanged()
        notifyObservers()
    }
    fun setMeasurements(){
        temperature = Random.nextFloat() % 50 - 25F
        humidity = Random.nextFloat() % 100
        pressure = Random.nextFloat() % 40F + 765
        measurementsChanged()
    }
}

/* import kotlin.random.Random

class observer.WeatherData : observer.Subject {
    override var observers = ArrayList<observer.Observer>()

    override fun registerObserver(o : observer.Observer) {
        o.sub = this
        observers.add(o)
    }

    override fun removeObserver(o : observer.Observer) {
        observers.remove(o)
    }

    override fun notifyObserver() {
        observers.forEach{
            it.update(getTemperature(), getHumidity(), getPressure()) }
    }

    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F

    fun getTemperature(): Float{
        return temperature
    }
    fun getHumidity() : Float{
        return humidity
    }
    fun getPressure() : Float{
        return pressure
    }

    fun measurementsChanged(){
        notifyObserver()
    }

    fun setMeasurements(){
        temperature = Random.nextFloat() % 50 - 25F
        humidity = Random.nextFloat() % 100
        pressure = Random.nextFloat() % 40F + 765
        measurementsChanged()
    }
} */
        /// Another way
