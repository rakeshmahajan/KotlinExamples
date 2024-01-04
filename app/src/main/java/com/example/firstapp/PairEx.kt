package com.example.firstapp

class PairEx {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // Example using Pair
            val personInfo: Pair<String, Int> = Pair("John Doe", 30)
            println("Person: ${personInfo.first}, Age: ${personInfo.second}")

            // Example using Triple
            val carDetails: Triple<String, String, Int> = Triple("Toyota", "Camry", 2022)
            println("Car: ${carDetails.first} ${carDetails.second}, Year: ${carDetails.third}")

            // Pair and Triple in function return
            val (name, age) = getPersonInfo()
            println("Person: $name, Age: $age")

            val (make, model, year) = getCarDetails()
            println("Car: $make $model, Year: $year")
        }

        fun getPersonInfo(): Pair<String, Int> {
            val name = "Alice"
            val age = 25
            return Pair(name, age)
        }

        fun getCarDetails(): Triple<String, String, Int> {
            val make = "Ford"
            val model = "Mustang"
            val year = 2023
            return Triple(make, model, year)
        }
    }
}