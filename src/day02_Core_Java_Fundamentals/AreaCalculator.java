package day02_Core_Java_Fundamentals;

public class AreaCalculator {

    // Area of circle
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of rectangle
    static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Circle Area: " + area(7.0));
        System.out.println("Rectangle Area: " + area(10, 5));
    }
}

//Circle Area: 153.93804002589985
//Rectangle Area: 50