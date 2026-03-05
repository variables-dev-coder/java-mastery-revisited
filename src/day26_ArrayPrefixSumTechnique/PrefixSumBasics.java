package day26_ArrayPrefixSumTechnique;

public class PrefixSumBasics {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 8, 10};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {

            prefix[i] = prefix[i -1] + arr[i];
        }

        for(int num : prefix)
            System.out.print(num + " ");  // 2 6 12 19 27 37
    }
}
