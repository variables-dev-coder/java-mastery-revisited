package revision_Arrays;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        int n = arr.length;

        int[] frequency = new int[n + 1];

        for (int value : arr) {

            frequency[value]++;

            if (frequency[value] > 1) {

                System.out.println("Duplicate = " + value);
                break;
            }
        }
    }
}
