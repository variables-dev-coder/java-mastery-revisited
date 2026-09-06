package revision_Arrays;

public class FindingTwoElementsAppearOnce {

    static int[] findTwoUnique(int[] arr) {

        // Step 1: XOR all elements
        int xorAll = 0;

        for (int num : arr) {
            xorAll ^= num;
        }

        // Step 2: Find rightmost set bit
        int rightmostSetBit = xorAll & -xorAll;

        int first = 0;
        int second = 0;

        // Step 3: Divide into two groups
        for (int num : arr) {

            if ((num & rightmostSetBit) == 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        return new int[]{first, second};
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2, 5};

        int[] answer = findTwoUnique(arr);

        System.out.println("First unique = " + answer[0]);
        System.out.println("Second unique = " + answer[1]);
    }
}
