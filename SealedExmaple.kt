package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {
    var a = Add(1, 2)
    var result = execute(a)
    print(result)
}

fun execute(a: Operation) = when (a) {
    is Add -> a.a + a.b
    is Multi -> a.a * a.b
    is Divide -> a.a / a.b
    is Substract -> a.a - a.b
}

sealed class Operation


class Add(var a: Int, var b: Int) : Operation()
class Multi(var a: Int, var b: Int) : Operation()
class Divide(var a: Int, var b: Int) : Operation()
class Substract(var a: Int, var b: Int) : Operation()


