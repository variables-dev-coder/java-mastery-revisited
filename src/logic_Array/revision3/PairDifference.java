package logic_Array.revision3;

import java.util.Arrays;

public class PairDifference {
    public static boolean findPair(int[] arr, int diff) {

        Arrays.sort(arr);

        int left = 0, right = 1;

        while (right < arr.length) {
            int d = arr[right] - arr[left];

            if (d == diff && left != right) return true;
            else if (d < diff) right++;
            else left++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,20,3,2,50,80};
        int diff = 78;

        System.out.println(findPair(arr, diff));
    }
}
