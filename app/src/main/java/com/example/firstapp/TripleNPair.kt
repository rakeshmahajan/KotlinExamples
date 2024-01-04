package com.example.firstapp

// New in Kotlin. Not available in JAVA
class TripleNPair {
    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            var(a,b) = Pair<String,Int>("A", 10)
            // I cannot declare "a" again as separate varaible, it will give me error
            //var a : Int = 10
            print("$a ,, $b")
            a = "New var"
            println("$a ,, $b")

            var mypair = Pair<Int, Int>(100, 1011)
            println(mypair)
            println("${mypair.first} ::: ${mypair.second}")

            // Nested Pairs
            var nestedpair = Pair("Mynestedpair", Pair(100, Pair(true,false)))
            println(nestedpair.second)
            println(nestedpair.second.second.first)

            //Triple
            var(x,y,z) = Triple(1,2,false)

            //Nested triple
            var ntriple = Triple(1,2,Pair("one",Triple(101,102,103)))
            println(ntriple)
            println(ntriple.third.second.second)
        }
    }
}