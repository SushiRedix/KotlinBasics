package com.sushi.kotlinbasics

data class User(val ID : Long, val name : String) //Must have at least one parameter

fun main() {
    val user1 = User(1, "Sasha")
    println(user1.component1()) //Prints the ID
    println(user1.component2()) //Prints the name

    val (id, name) = user1 //Assigns to a variable called ID, and to a variable called name
}

