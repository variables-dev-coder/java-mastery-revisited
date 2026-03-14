package logic_Array.day12_Prefix_Sum;

public class PrefixSumExample {

    public static void main(String[] args) {

        int[] nums = {2,4,1,3,6};

        int n = nums.length;

        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int L = 1;
        int R = 3;

        int rangeSum;

        if(L == 0)
            rangeSum = prefix[R];
        else
            rangeSum = prefix[R] - prefix[L-1];

        System.out.println("Range Sum = " + rangeSum);
    }
}
