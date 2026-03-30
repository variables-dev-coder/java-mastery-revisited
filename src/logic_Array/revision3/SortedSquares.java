package logic_Array.revision3;

public class SortedSquares {
    public static int[] sortedSquares(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];

        int left = 0, right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                res[idx--] = leftSq;
                left++;
            } else {
                res[idx--] = rightSq;
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};

        int[] res = sortedSquares(arr);

        for (int num : res) System.out.print(num + " ");
    }
}
