package wrapperClassRevision;

public class WrapperExample11 {

    public static void main(String[] args) {

        // Age received from user as String
        String ageInput = "25";

        // String -> int
        int age = Integer.parseInt(ageInput);

        // int -> Integer (Autoboxing)
        Integer ageObject = age;

        // Check whether age is valid
        if (ageObject != null) {

            if (ageObject >= 18) {
                System.out.println("Age: " + ageObject);
                System.out.println("Person is an adult.");
            } else {
                System.out.println("Person is a minor.");
            }
        }

        // Comparing wrapper values
        Integer requiredAge = 18;

        if (requiredAge.equals(18)) {
            System.out.println("Required age is 18.");
        }

        // Integer -> int (Auto-unboxing)
        int finalAge = ageObject;

        System.out.println("Final age: " + finalAge);
    }
}
