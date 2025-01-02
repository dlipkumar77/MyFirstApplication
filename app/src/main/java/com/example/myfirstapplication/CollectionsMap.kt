package com.example.myfirstapplication

fun main(args: Array<String>) {

    /*
    map - two different data types
    key & value used
    immutable - no change values
     mutable - changes ex: put method
     */

    println("--------immutable map of---------------")
    var age = mapOf<String,Int>("david" to 20 , "ronaldo" to 25)
    println("Age of David : " + age["david"])
    println("Age of Ronaldo : " + age["ronaldo"])

    var mutableAge = mutableMapOf<String,Int>("david" to 20 , "ronaldo" to 25)
    mutableAge.put("buffon",30)

    println("--------mutable map of---------------")
    println("Age of David : " + age["david"])
    println("Age of Ronaldo : " + age["ronaldo"])
    println("Age of Buffon : " + mutableAge["buffon"])

}