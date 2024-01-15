package com.example.firstapp

fun main(){
    var kc = Kclass()
    println(kc.a)
    println(Kclass().a)
    println("The Sum is : " + kc.add(4,5))

    kc = Kclass(10)
    kc = Kclass(10,20)

    var kcc = Kclasswithcons(10, 20)
    println(kcc.reta())
    println(kcc.a)
}

/**
 * Following are all valid defintion of class
 *
 * class test{  }
 * class test(){ }
 * class test(var1: type, var2:type) { }
 *
 * // If the constructor has annotations or visibility modifiers,
 * // the constructor keyword is required and the modifiers go before it:
 *
 * class test public @Inject constructor(name: String) { /*...*/ }
 *
 * class test{
 *      constructor() { }
 *      constructor(var1: type){ }
 * }
 */



class Kclass {
    var a : Int = 10

    // You can have one or many init blocks
    // If you have multiple init blocks all will be executed in the order defined
    init {
        println("This always gets executed on object creation")
    }

    // This empty constructor is not required. Putting it here just so that
    // my call with default constructor can be compiled
    // If you don't have any constructor then class() will work but when you define
    // a explicit constructor then class() will not work
    constructor(){}

    constructor(x : Int){
        println("Cons1 called ... Value of x :: $x")
    }
    constructor(x: Int, y:Int = 10){
        println("Cons2 called ... Value of x : $x and y : $y")
    }



    fun add(x: Int, y: Int) : Int{
        return x + y
    }
}

class Kclasswithcons (var a : Int){

    // Secondary constructor
    //constructor(x: Int, y : Int) {
    constructor(x: Int, y : Int) : this(10) {
        val sum = x + y
        println("Sum is $sum")
    }

    init {
        println("This is something i want to do with every object creation")
    }

    fun reta() : Int {
        return 0
    }
}