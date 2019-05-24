package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {
var clas = Oper()

    clas.Add(1,2)
    println(clas.Multi(3,2))
}

class Oper {
    fun Add(a: Int, b: Int): Int {
        return a+b
    }
    fun Sub(a:Int, b:Int): Int{
        return a-b
    }
}

fun Oper.Multi(a:Int, b:Int): Int{
    return a*b
}