package com.example.firstapp

// Define an interface
interface Shape {
    var name : String
    fun area(): Double
    fun perimeter(): Double
}

// Implement the interface in a class
class Circle(val radius: Double) : Shape {
    override var name: String = "Circle"
        get() = field
        set(value) {}

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape {
    override var name: String
        get() = "Rectangle"
        set(value) {}
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    // Create instances of classes implementing the Shape interface
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)
    circle.name = "My circle"

    // Use the interface methods
    println("Circle - Area: ${circle.area()}, Perimeter: ${circle.perimeter()}")
    println("Rectangle - Area: ${rectangle.area()}, Perimeter: ${rectangle.perimeter()}")

    println("Circle name : ${circle.name}")
}
