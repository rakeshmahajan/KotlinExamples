package com.example.firstapp

fun main(args: Array<String>){
    var x : Int = 10
    var studentmarks : Int = 75
    var isExcellent = studentmarks > 90
    var isGood = studentmarks in 75..90

    println(isExcellent)
    println(isGood)

    if (studentmarks > 90) {
        print("Grade A")
    }else if (studentmarks >= 75 ){
        println("Grade B")
    }else{
        println("Fail")
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


