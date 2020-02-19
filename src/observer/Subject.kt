package observer

import observer.Observer

interface Subject {
    var observers : ArrayList<Observer>
    fun registerObserver(o : Observer)
    fun removeObserver(o : Observer)
    fun notifyObserver()
}