package com.sushi.kotlinbasics

fun main() {
    var cell1 = MobilePhone("IOS", "Apple", "IPhone 14 Pro Max", 32,"red");
    cell1.call(cell1.model)

    var person1 = Person("Sasha", "Chverenko", 15)

    myFunc(5)
}

//DON'T DO THAT
fun myFunc(a : Int) { //It's called shadowing when you have the parameter and a local scope variable with the same name.
    var a = 4
    println(a) //Prints 4 not 5
}

class MobilePhone (osName: String, brand: String, model : String, MP : Byte) {
    //Member variables - Proprieties
    var color : String? = null
    var wifi : String? = null
    var model : String? = null
    private var battery : Int = 25

    var MP : Byte = 0
    get() = field
    set(value) {
        var message : String = if(value > 48) "YO THAT'S A GOOD PHONE" else "Cool"
        println(message)
    }

    init {
        this.MP = MP
        println("Here the osName is $osName, brand is $brand, model is $model")
    }

    //Secondary constructor
    constructor(osName: String, brand: String, model: String, MP : Byte, color : String)
        : this (osName, brand, model, MP) {
            this.color = color
            println("The color of the phone is $color")
        }

    //Member functions - Methods
    fun call(model : String?) {
        println("Calling with phone: $model")
    }

    fun chargeBattery(value : Int) {
        println("The battery had $battery% before")
        battery += value
        println("Now it has $battery%")
    }
}

class Person(name : String, surname : String) {
    init {
        println("Created person $name $surname")
    }

    constructor(name : String, surname : String, age : Byte)
        : this(name, surname) {
            println("Created person $name $surname $age years old")
        }
}