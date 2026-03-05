package day26_ArrayPrefixSumTechnique;

public class SubarraySumPrefix {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int target = 6;

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++)
            prefix[i] = prefix[i-1] + arr[i];

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){

                int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];

                if(sum == target)
                    System.out.println("Subarray found from " + i + " to " + j);
            }
        }
    }
}

// Subarray found from 0 to 2