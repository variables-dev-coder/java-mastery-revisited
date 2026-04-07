package logic_Array.revision_1_15_days;

public class Day4_SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
