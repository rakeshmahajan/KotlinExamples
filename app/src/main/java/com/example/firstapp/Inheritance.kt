package com.example.firstapp

import java.time.LocalDate
import java.time.Period

fun main(){
    var per = Person("John", LocalDate.of(2000,1,10), "Male",
        "UNQ1234")
    var emp = Employee("John", LocalDate.of(2000,1,10), "Male",
                    "UNQ5678", 1234, "Engineer", "Mumbai")

    var mgr = Manager("John", LocalDate.of(2000,1,10), "Male",
        "UNQ9999", 5678, "Engineer", "Mumbai")
    mgr.whoami()

    //println(emp.getAge())

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
        println("Per : Count of Person list ${personList}")
        println("Per : Count of Person list ${personList.size}")
    }

    fun getName() = name
    fun getDoB() = dob
    fun getGender() = gender
    fun getUniqueId() = uniqueid
    fun getAge() : Int{
        return Period.between(dob, LocalDate.now()).years
    }
    open fun whoami() {
        println("I am Person ... ! ")
    }
}

open class Employee(name: String, dob: LocalDate, gender:String, uniqueid: String,
               empid: Int, designation: String, worklocation: String)
    : Person(name, dob, gender, uniqueid){


    companion object{
        var empList : HashMap<Int, Employee> = HashMap<Int,Employee>()
        fun getAllEmployees() = empList
    }

    init {
        empList.set(empid, this)
        println("Emp : Printing person list : ${personList}")
        println("Emp : Printing Employee list : ${empList}")
        println("Emp : Count of Person list ${personList.size}")
        println("Emp : Count of Employee list ${empList.size}")
    }

    override fun whoami() {
        println("I am Employee ... ! ")
    }
}

class Manager(name: String, dob: LocalDate, gender:String, uniqueid: String,
              var empid: Int, var designation: String, var worklocation: String)
    : Employee(name, dob, gender, uniqueid, empid, designation, worklocation) {

    override fun whoami() {
        println("I am Manager ... ! ")
    }
}