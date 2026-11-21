package exceptionHandiling;

// create our own Checked and Unchecked Exceptions

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main_17 {

    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "You are not eligible"
            );
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        try {

            validateAge(15);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }
    }
}
