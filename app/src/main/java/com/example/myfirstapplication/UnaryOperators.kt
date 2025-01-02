package com.example.myfirstapplication

fun main(args: Array<String>) {

    var number:Double = 7.6
    var isCheck:Boolean = true

    println("+number = " + +number)
    println("-number = " + -number)
    println("++number = " + ++number)
    println("--number = " + --number)
    println("!isCheck = " + !isCheck)

    println("---------------------------")

    var result:Double= 4.7

    println("result++ = " + result++)  // first print result value then add but not console reflect
    println("result = " + result)  // now reflect the added value
    println("++result = " + ++result)
    println("result = " + result)
}