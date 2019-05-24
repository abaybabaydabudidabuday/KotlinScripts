package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {

}

abstract class Vehicle {
    var name: String = "Not inited"
    abstract var foals: String
    fun runEveryWhere() {
        println("hello bitch")
    }

    abstract fun hello()
}

class Example : Vehicle() {
    override var foals: String = "Hello"

    override fun hello() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}