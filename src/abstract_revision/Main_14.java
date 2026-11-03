package abstract_revision;

// Shape Area Calculator (Abstract Class)

abstract class Shape {

    abstract double calculateArea();

    void display() {
        System.out.println("Calculating shape area...");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
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
    double calculateArea() {
        return length * width;
    }
}

public class Main_14 {

    public static void main(String[] args) {

        Shape shape;

        shape = new Circle(5);
        shape.display();
        System.out.println("Circle Area: " + shape.calculateArea());

        shape = new Rectangle(10, 5);
        shape.display();
        System.out.println("Rectangle Area: " + shape.calculateArea());
    }
}
