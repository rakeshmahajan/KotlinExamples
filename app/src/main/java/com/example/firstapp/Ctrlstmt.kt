package com.example.firstapp

fun main(args: Array<String>){
    var x : Int
    val y : Int
    x = args.get(0).toInt()
    x = args[0].toInt()
    //for ( arg in args){
    //    println("Arg : $arg")
    //}

    if (x > 100) {
        println("X is greater than 100")
    }else if ( x > 0){
        println("x is greater than 0")
    }

    when{
        x > 100 -> {
            println("Using when : X is greater than 100")
        }
        x > 0 -> {
            println("Using when : X is greatin than 0")
        }
    }
}


