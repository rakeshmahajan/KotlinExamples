package com.example.firstapp

class Whileloop {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            var i : Int = 10
            while ( i > 0){
                println("Value of $i")
                i--
            }
            // Will run atleast once even if condition is false
            // as condition is checked later in the loop
            i = 10
            do {
                println("Do .. While Value of $i")
            } while (i < 10)
        }
    }
}