package logic_Array.day12_Prefix_Sum;

public class PrefixSumDemo {

    public static void main(String[] args) {

        int[] nums = {3,1,4,2,5};

        int n = nums.length;
        int[] prefix = new int[n];

        // build prefix array
        prefix[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int L = 2;
        int R = 4;

        int sum;

        if(L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L-1];

        System.out.println("Range Sum = " + sum);
    }
}
