package com.example.firstapp

import java.time.LocalDate
import java.time.Period

fun main(){
    var emp = Employee("John", LocalDate.of(2000,1,10), "Male",
                    "UNQ1234", 1234, "Engineer", "Mumbai")

    println(emp.getAge())

}

open class Person(private var name: String, private var dob: LocalDate,
                  private var gender:String, private var uniqueid: String){

    /**
     * Static properties in Kotlin cannot be inherited by subclass
     * This is unlike JAVA where static properties can be inherited by subclass
     * So this personList and getAllPerson cannot be access using Employee or Manager class
     */
    companion object{
        var personList : HashMap<String, Person> = HashMap<String,Person>()
        fun getAllPersons() = personList
    }

    init {
        personList.set(uniqueid, this)
        println("Count of personlist ${personList.size}")
    }

    fun getName() = name
    fun getDoB() = dob
    fun getGender() = gender
    fun getUniqueId() = uniqueid
    fun getAge() : Int{
        return Period.between(dob, LocalDate.now()).years
    }
}
class Employee(name: String, dob: LocalDate, gender:String, uniqueid: String,
               var empid: Int, var designation: String, var worklocation: String)
    : Person(name, dob, gender, uniqueid){

        constructor(uqid : String) : this(){
            var p = Person.getAllPersons().get(uqid)
            if (p != null) {
                Employee(p.getName(), p.getDoB(), p.getGender(), uqid, 1234, "Manager", "Ahd")
            }
        }
}

class Manager(){

}