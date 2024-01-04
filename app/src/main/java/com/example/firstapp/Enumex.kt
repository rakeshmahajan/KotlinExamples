package com.example.firstapp

// Define an enum class for days of the week
enum class DayOfWeek(val isWeekend: Boolean = false) {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true),
    SUNDAY(true);

    // Function to check if the day is a working day
    fun isWorkingDay(): Boolean {
        return !isWeekend
    }
}

fun main() {
    // Using the DayOfWeek enum
    val today = DayOfWeek.WEDNESDAY
    println("Today is $today")

    // Checking if today is a working day
    if (today.isWorkingDay()) {
        println("It's a working day.")
    } else {
        println("It's a weekend day.")
    }

    // Enum iteration
    println("\nAll Days of the Week:")
    for (day in DayOfWeek.values()) {
        println("$day - Working Day: ${day.isWorkingDay()}")
    }

    // Enum comparison
    val selectedDay = DayOfWeek.FRIDAY
    if (today == selectedDay) {
        println("Today is the selected day.")
    } else {
        println("Today is not the selected day.")
    }
}
