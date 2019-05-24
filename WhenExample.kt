package kz.fa.onlinekassa.persistense

fun  main(args:Array<String>){
    doit(1)
    doit(2)
    doitAnya(1)
    doitAnya("Dorou")
}


fun doit(n: Int){
    when(n){
        1 ->{
            println("da, ti pidor")
        }
        2 ->{
            println("net, ti pidor")
        }
        else ->{
            println("pohodu ti reallno pidor")
        }
    }
}
fun doitAnya(n:Any){
    when(n){
        1->{
            println("AKOOOO")
        }
        "Dorou" ->{
            println("chepok")
        }
        else ->{

        }
    }
}
