package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {
    example1()
    example2()
    example3()
    example4()
    example5()
}

fun example1() {
    var a: String = "Hello" // variable is declared as non-null by default
    println("a it is a bitch of $a")
//    a= null
    var b: String? = "Dorou" // variable is declared as nullable
    println("b is a son of $b")

    b = null
    println("b is a son of $b")

}

fun example2() {
    var b: String? = "Hello"
    var blin = if (b != null) b.length else -1
    println(blin)

    b = null
    blin = if (b != null) b.length else -1
    println(blin)

}

fun example3() {
    var b: String? = "hallo"
    var c = b?.length
    println(c)

    b = null;
    c = b?.length
    println(c)
}

fun example4() {
    var b: String? = "gap"
    var blin = b?.length ?: "pidor"
    println(blin)

    b = null
    blin = b?.length ?: "pidor"
    println(blin)
}

fun example5(){
    var b: String? = "opa"
    var blin = b!!.length
    println(blin)
    b=null
    blin = b!!.length
    println(blin)
}