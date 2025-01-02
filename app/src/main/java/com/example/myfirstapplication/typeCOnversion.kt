package com.example.myfirstapplication

/*
toByte()
toShort()
toInt()
toLong()
toDouble()
toFloat()
 */

fun main(args: Array<String>) {

  /*
    var x:Byte = 127
    var y:Int = x.toInt()
    var z:Double = x.toDouble()

    println(x)
    println(y)
    println(z)

   */

    var a:Double = 132.32
    var b:Int = a.toInt()
    var c:Byte = a.toInt().toByte()

    println(a)
    println(b)
    println(c)

}