package revision4;

public class MethodReturningValue {

    static int add(int a, int b) {

        return a + b;
    }

    static int square(int number) {

        return number * number;
    }

    public static void main(String[] args) {

        int result1 = add(10, 20);
        int result2 = square(5);

        System.out.println("Addition: " + result1);
        System.out.println("Square: " + result2);
    }
}
