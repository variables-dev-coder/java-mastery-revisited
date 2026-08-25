package revision4;

public class Methods2 {

    // 1. No parameter + void
    static void greet() {

        System.out.println("Hello Java!");
    }

    // 2. Parameters + void
    static void greet(String name) {

        System.out.println("Hello " + name);
    }

    // 3. Parameters + return value
    static int add(int a, int b) {

        return a + b;
    }

    // 4. Method overloading
    static int add(int a, int b, int c) {

        return a + b + c;
    }

    // 5. Another overloaded method
    static double add(double a, double b) {

        return a + b;
    }

    // 6. Pass-by-value
    static void change(int x) {

        x = 100;
    }

    public static void main(String[] args) {

        // Method call
        greet();

        // Parameter
        greet("Munna");

        // Return value
        int result = add(10, 20);

        System.out.println("2 numbers: " + result);

        // Overloaded method
        System.out.println(
                "3 numbers: " + add(10, 20, 30)
        );

        // Overloaded method with double
        System.out.println(
                "Double: " + add(10.5, 20.5)
        );

        // Pass-by-value
        int number = 10;

        System.out.println("Before: " + number);

        change(number);

        System.out.println("After: " + number);
    }
}
