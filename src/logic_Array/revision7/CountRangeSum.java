package logic_Array.revision7;

public class CountRangeSum {

    static int count = 0;

    public static int countRangeSum(int[] nums,
                                    int lower,
                                    int upper) {

        long[] prefix = new long[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        mergeSort(prefix, 0, prefix.length - 1,
                lower, upper);

        return count;
    }

    static void mergeSort(long[] arr,
                          int left,
                          int right,
                          int lower,
                          int upper) {

        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid, lower, upper);
        mergeSort(arr, mid + 1, right, lower, upper);

        countPairs(arr, left, mid, right,
                lower, upper);

        merge(arr, left, mid, right);
    }

    static void countPairs(long[] arr,
                           int left,
                           int mid,
                           int right,
                           int lower,
                           int upper) {

        int start = mid + 1;
        int end = mid + 1;

        for (int i = left; i <= mid; i++) {

            while (start <= right &&
                    arr[start] - arr[i] < lower)
                start++;

            while (end <= right &&
                    arr[end] - arr[i] <= upper)
                end++;

            count += end - start;
        }
    }

    static void merge(long[] arr,
                      int left,
                      int mid,
                      int right) {

        long[] temp = new long[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left, k = 0; i <= right; i++, k++)
            arr[i] = temp[k];
    }

    public static void main(String[] args) {

        int[] nums = {-2,5,-1};

        System.out.println(
                countRangeSum(nums,-2,2)
        );
    }
}
