package wrapperClassRevision;

public class WrapperExample13 {

    public static void main(String[] args) {

        // String values
        String value1 = "500";
        String value2 = "750";

        // String -> Integer object
        Integer num1 = Integer.valueOf(value1);
        Integer num2 = Integer.valueOf(value2);

        // Compare the values
        int result = Integer.compare(num1, num2);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        if (result < 0) {
            System.out.println(num1 + " is smaller than " + num2);
        }
        else if (result > 0) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}
