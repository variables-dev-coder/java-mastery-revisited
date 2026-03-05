package day26_ArrayPrefixSumTechnique;

public class RangeSumQuery2 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 8, 2, 3, 0};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + arr[i];

        int L = 2;
        int R = 5;

        int sum;

        if (L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L - 1];

        System.out.println("Sum = " + sum);   // Sum = 13
    }
}
