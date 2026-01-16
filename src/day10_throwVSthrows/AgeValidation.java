package day10_throwVSthrows;

// Understand manual exception creation

public class AgeValidation {

    static void validate(int age) {
        if (age < 18) {

            throw new IllegalArgumentException("Age must be >= 18");

           // throw new RuntimeException("Age must be >= 18");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {

       // validate(16);
       // System.out.println("End of program"); // IllegalArgumentException: Age must be >= 18


     // -----------------------

        validate(20);
        System.out.println("End of program");

        //Valid age
        //End of program
    }
}

//Practice

//Change age to 20
//Observe flow
//Replace IllegalArgumentException with RuntimeException

