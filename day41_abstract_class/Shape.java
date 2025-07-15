// Abstract class
abstract class Shape {
    abstract double getArea();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Remove `public` here 👇
class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        rect.display();
        System.out.println("Rectangle Area: " + rect.getArea());

        circle.display();
        System.out.println("Circle Area: " + circle.getArea());
    }
}
