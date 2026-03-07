package day27_Array_SubarrayBasics;

public class EvenSumSubarray {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int count = 0;

        for(int start = 0; start < arr.length; start++) {

            int sum = 0;

            for(int end = start; end < arr.length; end++) {

                sum += arr[end];

                if(sum % 2 == 0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
