package com.example.firstapp

class Forloop {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            // Will run from 0 to 10
            for (i in 0..10 step 2){
                println("Value of $i")
            }
            // Will run from 0 to 9
            for ( i in 0 until 10 step 5){
                println("Value of $i")
            }
            // Will run decrementing values
            for ( i in 10 downTo 0 step 3){
                println("Value of $i")
            }

            var myarr = ArrayList<Int>()
            for (i in 0..10){
                myarr.add(i*i)
            }

            for (i in myarr){
                println("Value of array $i")
            }
        }
    }
}