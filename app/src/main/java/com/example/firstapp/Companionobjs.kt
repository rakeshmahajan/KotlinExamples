package com.example.firstapp

fun main(){
    var co = Companionobjs()
    println("CO : $co")
    println("Value of co b : ${Companionobjs.b}")
    println("Value of co b : ${Companionobjs.mycobj.b}")
    //println("Calling func ${Companionobjs.mystaticfun()}")
    Companionobjs.mystaticfun()

    var s1 = StudentData("Kotlin", 5)
    var s2 = StudentData("JAVA", 20)
    println("Student count : ${StudentData.getStudentCount()}")
}

class Companionobjs {
    private var x : Int = 10

    // CO server to define static methods
    // Only once companion objecct is allowed per class
    // Companion object can be named, default name is "Companion"
    companion object mycobj {
        var b : Int = 20

        fun mystaticfun(){
            var c : Companionobjs
            c = Companionobjs()
            println("${c.x}")
            println("Value of b : $b")

        }
    }

}

class StudentData(var name: String, var age: Int){

    init{
        studentcount++
    }
    companion object{
        var studentcount : Int = 0
        fun getStudentCount() = studentcount
    }
}