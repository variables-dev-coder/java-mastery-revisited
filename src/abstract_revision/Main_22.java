package abstract_revision;

@FunctionalInterface
interface Calculator22 {

    int calculate(int a, int b);

    default void display() {
        System.out.println("Calculator Application");
    }

    static void info() {
        System.out.println("Supports mathematical operations");
    }
}

public class Main_22 {

    public static void main(String[] args) {

        Calculator22 addition = (a, b) -> a + b;

        Calculator22 subtraction = (a, b) -> a - b;

        Calculator22 multiplication = (a, b) -> a * b;

        Calculator22 division = (a, b) -> a / b;

        Calculator22.info();

        addition.display();

        System.out.println("Addition: " + addition.calculate(20, 10));

        System.out.println("Subtraction: " + subtraction.calculate(20, 10));

        System.out.println("Multiplication: " + multiplication.calculate(20, 10));

        System.out.println("Division: " + division.calculate(20, 10));
    }
}
