package revision_Arrays;

public class FindSecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 50, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {

            if (value > largest) {

                secondLargest = largest;
                largest = value;

            } else if (value > secondLargest && value != largest) {

                secondLargest = value;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
