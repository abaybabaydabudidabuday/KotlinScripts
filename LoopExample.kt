package kz.fa.onlinekassa.persistense

fun main(args: Array<String>) {
    var array = listOf("asd", "123", "123123")
    for (item in array) {
        println(item)
    }
    for (i in 1..5) {
        println(i)
    }
    for ((index, item) in array.withIndex()) {
        println("$index $item")
    }
    array.forEach {
        println(it)
    }
    repeat(10){
        print("repeated haha ")
    }

    var i:Int = 1
    while (i<4){
        i++
        print(i)
    }
    while(true){
        println(i)
        i++
        if(i>8){
            break
        }
    }
    do{
        println(i)
        i++
    }while(i<10)
}