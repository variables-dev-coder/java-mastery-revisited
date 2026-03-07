package day27_Array_SubarrayBasics;

import java.util.HashSet;

public class ZeroSumSubarray {

    public static void main(String[] args) {

        int[] arr = {4,2,-3,1,6};

        HashSet<Integer> set = new HashSet<>();

        int prefixSum = 0;

        for(int num : arr){

            prefixSum += num;

            if(prefixSum == 0 || set.contains(prefixSum)){
                System.out.println("Zero sum subarray exists");
                return;
            }

            set.add(prefixSum);
        }

        System.out.println("No zero sum subarray");
    }
}
