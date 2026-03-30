package logic_Array.revision3;

public class TwoSumSorted {
    public static int[] twoSum(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target)
                return new int[]{left, right};

            else if (sum < target) left++;
            else right--;
        }
        
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int target = 6;

        int[] res = twoSum(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
