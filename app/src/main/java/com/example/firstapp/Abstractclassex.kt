package com.example.firstapp

// Define an abstract class
abstract class AbsShape {
    // Abstract properties (to be implemented by subclasses)
    abstract val name: String

    // Abstract methods (to be implemented by subclasses)
    abstract fun area(): Double
    abstract fun perimeter(): Double

    // Concrete method
    fun description(): String {
        return "This is a $name."
    }
}

// Implement the abstract class in a subclass
class MyCircle(val radius: Double) : AbsShape() {
    override val name: String = "Circle"

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class MyRectangle(val width: Double, val height: Double) : AbsShape() {
    override val name: String = "Rectangle"

    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    // Create instances of subclasses
    val circle = MyCircle(5.0)
    val rectangle = MyRectangle(4.0, 6.0)

    // Use abstract class methods
    println(circle.description())
    println("Circle - Area: ${circle.area()}, Perimeter: ${circle.perimeter()}")

    println(rectangle.description())
    println("Rectangle - Area: ${rectangle.area()}, Perimeter: ${rectangle.perimeter()}")
}
