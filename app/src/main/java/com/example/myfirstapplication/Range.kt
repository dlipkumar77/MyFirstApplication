package com.example.myfirstapplication

fun main(args: Array<String>) {

    var myCharRange = 'a' .rangeTo('k')  // change j to k result see
    var myChar = 'k' in myCharRange
    println("myCharRange has K :" +myChar)
}