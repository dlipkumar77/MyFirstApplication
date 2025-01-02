package com.example.myfirstapplication

fun main(args: Array<String>) {

    /*

    var a:String = "Hello Kotlin"
    var b:String = "Language"
    var age:Int = 25

    println(a + " " + b)
    println("your age is = "+ age)

     */

    var x:String="Kotlin"
    var i:Int = x.length
    println("Length of the kotlin =" + i)
    var b:Boolean= x.equals("Java")
    println(b)
    println(x.isEmpty())
    println(x.plus(" Language"))
    println(x.lowercase())
    println("************")
    println(x.uppercase())

    var t:String = "     Android"
    println(x+t)
    println(x + t.trim())
}