package com.example.firstapp

// Define an interface
interface Shape {
    fun area(): Double
    fun perimeter(): Double
}

// Implement the interface in a class
class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape {
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

    // Use the interface methods
    println("Circle - Area: ${circle.area()}, Perimeter: ${circle.perimeter()}")
    println("Rectangle - Area: ${rectangle.area()}, Perimeter: ${rectangle.perimeter()}")
}
