package revision_Arrays;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original: " + numbers);

        // Get
        System.out.println("Element at index 2: " + numbers.get(2));

        // Update
        numbers.set(1, 200);

        System.out.println("After update: " + numbers);

        // Remove
        numbers.remove(0);

        System.out.println("After remove: " + numbers);

        // Size
        System.out.println("Size: " + numbers.size());

        // Add more
        numbers.add(50);
        numbers.add(60);

        System.out.println("Final: " + numbers);
    }
}
