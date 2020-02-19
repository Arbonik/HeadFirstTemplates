package observer

interface Observer {
    var sub : Subject
    fun update(temp : Float, humidity : Float, pressure : Float)
}