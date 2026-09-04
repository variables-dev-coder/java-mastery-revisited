package revision_Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = 5;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int value : arr) {
            actualSum += value;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number = " + missing);
    }
}
