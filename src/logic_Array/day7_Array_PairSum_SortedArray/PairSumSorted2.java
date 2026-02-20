package logic_Array.day7_Array_PairSum_SortedArray;

public class PairSumSorted2 {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 11};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No Pair Found!");
    }
}
