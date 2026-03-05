package day26_ArrayPrefixSumTechnique;

public class TotalSumPrefix {

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 3, 8};

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
            prefix[i] = prefix[i - 1] + arr[i];

        System.out.println("Total Sum = " + prefix[arr.length - 1]);
    }
}
