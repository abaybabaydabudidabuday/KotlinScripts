package kz.fa.onlinekassa.persistense

fun main(args:Array<String>){
    var stud = Student("Hello")
    var doro = Teacher("batya", "Poka")
    stud.eat()
    doro.eat()
}
open class Perton(var role: String = "Person", var name: String = "X"){
    fun eat(){
        println("eating "+ name)
    }
}
class Student (name: String) : Perton("Student", name){

}
class Teacher( role: String, name: String) : Perton(role,name){

}