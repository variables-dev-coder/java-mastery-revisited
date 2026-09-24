package wrapperClassRevision;

public class WrapperExample3 {

    public static void main(String[] args) {

        Integer num1 = 50;
        Integer num2 = 20;
        Integer num3 = 80;

        // Start with the largest possible int value
        int smallest = Integer.MAX_VALUE;

        if (num1 < smallest) {
            smallest = num1;
        }

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("Smallest number: " + smallest);
    }
}
