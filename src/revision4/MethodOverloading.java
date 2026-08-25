package revision4;

public class MethodOverloading {

    // 2 parameters
    static int add(int a, int b) {

        return a + b;
    }

    // 3 parameters
    static int add(int a, int b, int c) {

        return a + b + c;
    }

    // Different parameter types
    static double add(double a, double b) {

        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));

        System.out.println(add(10.5, 20.5));
    }
}
