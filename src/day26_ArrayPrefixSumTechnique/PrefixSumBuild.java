package day26_ArrayPrefixSumTechnique;

public class PrefixSumBuild {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int num : prefix)
            System.out.print(num + " "); // 2 6 7 10 15
    }
}
