package com.example.myfirstapplication

fun main(args: Array<String>) {

    var number1:Int = 5
    var number2:Int = 10
    var number3:Int = 12

    var result:Boolean = false

    // Conditional Operator (&&)

    result = (number1 > number2) && (number3 > number2)
    println("Result: " + result)

    // Conditional Operator (||)

    result = (number1 > number2) || (number3 > number2)
    println("Result: " + result)
 }