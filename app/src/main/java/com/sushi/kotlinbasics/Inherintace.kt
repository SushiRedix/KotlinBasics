package com.sushi.kotlinbasics

//Use open
open class Phone(name : String, color : String) {
    open fun call() {
        println("Calling with a phone")
    }
}

class Xiaomi(name : String, color : String) : Phone(name, color) {
    override fun call() {
        super.call() //Executes the code in the function + the new code
        println("And Xiaomi")
    }
}

//Use sealed if u don't want inheritance
sealed class Car() {

}

class Ferrari : Car() {

}

fun main() {
    val xiaomi = Xiaomi("sds", "yellow")
    val phone = Phone("ds", "red")

    xiaomi.call()
    println("Calling with a normal phone")
    phone.call()
}