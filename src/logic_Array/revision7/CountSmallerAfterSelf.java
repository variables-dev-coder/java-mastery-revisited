package logic_Array.revision7;

import java.util.*;

public class CountSmallerAfterSelf {

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    static int[] count;

    public static List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        count = new int[n];

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        mergeSort(arr, 0, n - 1);

        List<Integer> ans = new ArrayList<>();

        for (int c : count)
            ans.add(c);

        return ans;
    }

    static void mergeSort(Pair[] arr, int left, int right) {

        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    static void merge(Pair[] arr, int left, int mid, int right) {

        List<Pair> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        int rightCounter = 0;

        while (i <= mid && j <= right) {

            if (arr[j].value < arr[i].value) {

                rightCounter++;
                temp.add(arr[j++]);

            } else {

                count[arr[i].index] += rightCounter;
                temp.add(arr[i++]);
            }
        }

        while (i <= mid) {

            count[arr[i].index] += rightCounter;
            temp.add(arr[i++]);
        }

        while (j <= right)
            temp.add(arr[j++]);

        for (int k = left; k <= right; k++)
            arr[k] = temp.get(k - left);
    }

    public static void main(String[] args) {

        int[] nums = {5,2,6,1};

        System.out.println(countSmaller(nums));
    }
}
