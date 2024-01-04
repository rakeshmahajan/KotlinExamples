package com.example.firstapp

fun main(){
    println(Test1_0())
    println(Test1_1())
    println(Test1_2(10))
    println(Test1_3())
    println(Test1_3(10))
    println(Test1_4())
    println(Test1_5(10))
    //println(Test(10))
}

class Test1_0{ }     // No constructor defined
class Test1_1(){ }  // Empty primary
class Test1_2(var a : Int, var b : String = "Test") { } //Primary constructor with arugments
class Test1_3(){
    // If you define both primary and secondary constructor.
    // Then you have to make a call from secondary to primary constructor using this()
    constructor(a : Int) : this(){
        println("Value of a from Test1_3 : $a")
    }
}
class Test1_4{
    constructor(){ } // Empty secondary constructor. This is similar to empty primary constructor
    constructor(a : Int) {
        println("Value of a from Test1_3 : $a")
    }
}
class Test1_5(var a: Int, var b: String="Mytest"){
    var x : Int = 0   // Property variables have to be initialized

    init {
        x = a
        println("Value of a : $a, x : $x and b : $b")
    }
}

