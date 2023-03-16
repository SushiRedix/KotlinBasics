package com.sushi.kotlinbasics

interface IFoo { //SAM interface (Single Abstract Method)
    fun bar()
}

interface IPlant {
    val maxGrowth : Int
    fun grow() {
        println("The plant is bigger")
    }
}

class Plant(name : String, type : String, override val maxGrowth: Int) : IPlant {
    override fun grow() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val plant = Plant("Cactus", "Verde", 34)

    plant.grow()
}