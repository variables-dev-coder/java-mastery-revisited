package logic_Array.revision6;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = {3,4,-1,1};

        int n = nums.length;

        for(int i = 0; i < n; i++) {

            while(nums[i] > 0 &&
                    nums[i] <= n &&
                    nums[nums[i]-1] != nums[i]) {

                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for(int i = 0; i < n; i++) {

            if(nums[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(n + 1);
    }
}
