package polymorphism;

class Shape {

    void calculateArea() {
        System.out.println("Calculating shape area");
    }
}

class Circle extends Shape {

    @Override
    void calculateArea() {
        double radius = 5;
        System.out.println("Circle Area: " +
                (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {

    @Override
    void calculateArea() {
        int length = 10;
        int width = 5;

        System.out.println("Rectangle Area: " +
                (length * width));
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Shape shape;

        shape = new Circle();
        shape.calculateArea();

        shape = new Rectangle();
        shape.calculateArea();
    }
}
