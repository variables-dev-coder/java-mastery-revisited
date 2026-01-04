package day04_ObjectOrientedProgramming;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();  // Drawing circle

        s = new Rectangle();
        s.draw();  // Drawing rectangle

    }
}