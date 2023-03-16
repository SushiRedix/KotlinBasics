package com.sushi.kotlinbasics

fun main() {
    var name = "Sasha"
    //name = null -> CAN'T DO THAT: COMPILATION ERROR
    var nullableName : String? = "Sushi" //The '?' indicates that the variable is nullable

    var stringLength : Int = 0
    //For accessing methods of a variable i need to check if it's not null first
    if(nullableName != null) {
        stringLength = nullableName.length
    }

    //Or u can do directly like that, it stores null in value if nullableName is null
    var value = nullableName?.length

    //Short way to execute something if the values is NOT null
    nullableName?.let { println(it.length) }


    //NT: Can't do that
    //stringLength = nullableName.length

    //Elvis operator: ?:
    var username = nullableName ?: "User"
    println(username)

    //Not null assertion operator
}