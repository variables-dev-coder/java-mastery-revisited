package logic_Array.day12_Prefix_Sum;

public class PrefixExample4 {

    public static void main(String[] args) {

        int[] nums = {2,5,1,4,3};

        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int L = 1;
        int R = 4;

        int sum;

        if(L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L-1];

        System.out.println("Range Sum = " + sum);
    }
}
