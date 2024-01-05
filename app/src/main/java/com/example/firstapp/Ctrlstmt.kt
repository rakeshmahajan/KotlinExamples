package com.example.firstapp

fun main(args: Array<String>){
    //var x : Int = 10
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

    //var studentmarks = 90

    when (studentmarks){
        in 90..100 -> { println("Grade A")}
        in 75..89 -> { println("Grade B")}
        in 50 .. 74 -> {println("Grade C")}
        else -> { println("Fail")}
    }

    val today = "Monday"

    when (today){
        "Monday", "Tuesday", "Wednesday" -> println("Weekday")
        "Saturday", "Sunday" -> println("Weekend")
        else -> println("Invalid day")
    }

    var x : Any
    x = 10
    when (x){
        is Int -> println("Its an Integer")
        is Float -> println("Its an Float")
        is String -> println("Its an String")
        is Boolean -> println("Its an Boolean")
    }

}


