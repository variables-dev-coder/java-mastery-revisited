package exceptionHandiling;

// throw explicitly creates and throws an exception.

public class Main_14 {

    static void validateAge(int age) {

        if (age < 18) {

            throw new IllegalArgumentException(
                    "Age must be 18 or above"
            );
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        validateAge(15);
    }
}
