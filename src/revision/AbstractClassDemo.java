package revision;

abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Calculating area");
    }
}

class Rectangle extends Shape {
    double l = 10, b = 5;

    double area() {
        return l * b;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.display();
        System.out.println(s.area());
    }
}

