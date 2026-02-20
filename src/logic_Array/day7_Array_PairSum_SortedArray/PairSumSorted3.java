package logic_Array.day7_Array_PairSum_SortedArray;

public class PairSumSorted3 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 8, 10};
        int target = 14;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + " and " + arr[right]);
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
