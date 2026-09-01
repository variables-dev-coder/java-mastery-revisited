package revision_Arrays;

public class CreateUpdateAccess {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        // Update element
        numbers[2] = 100;

        System.out.println("\nAfter updating index 2:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);

        }
    }
}
