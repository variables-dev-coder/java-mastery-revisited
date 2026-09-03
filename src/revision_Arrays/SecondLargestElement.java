package revision_Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 80, 60};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {

            if (value > largest) {
                secondLargest = largest;
                largest = value;
            }
            else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
