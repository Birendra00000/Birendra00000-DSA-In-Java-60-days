// Base class
class Shape {
    // Method to be overridden
    double area() {
        return 0;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding area() method
    @Override
    double area() {
        return length * width;
    }
}

// Derived class: Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area() method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Main class to test
public class Inheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(7);

        System.out.println("\nArea of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
