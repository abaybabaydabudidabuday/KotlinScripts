package kz.fa.onlinekassa.persistense

fun main(args: Array<String>){
    var books: ArrayList<Book> = ArrayList()
    books.add(Book("Switch", "Porter", 23))
    books.add(Book("Domoi","Zataev",405))
    for(book in books)
        println(book)

}

data class Book(val name: String, val author: String, val page: Int)