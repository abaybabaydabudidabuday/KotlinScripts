package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {
    var per1 = Person("Tima", 18, "Lekar")
    per1.doIt()
}

class Person constructor(var name: String, var age: Int) {
    init{
        println("heloo")
    }

    var prof: String = "Nothing"

    constructor(name: String, age: Int, prof: String) : this(name, age) {
        this.prof = prof
    }

    fun doIt() {
        println("$name whose profession is $prof, is $age years old.")
    }

}