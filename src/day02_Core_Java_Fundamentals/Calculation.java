package day02_Core_Java_Fundamentals;

// Method overloading

public class Calculation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculation c = new Calculation();

        System.out.println(c.add(2, 3));         // 6

        System.out.println(c.add(2.5, 3.5));     // 6.0

        System.out.println(c.add(1, 2, 3));   // 6
    }
}
