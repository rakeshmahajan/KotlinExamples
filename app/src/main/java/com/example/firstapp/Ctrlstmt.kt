package com.example.firstapp

fun main(){
    var x = 10
    val y = 11

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


class Ctrlstmt {
    var x = 10
    var y : Int = 12


    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            var x = 10

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
    }
}