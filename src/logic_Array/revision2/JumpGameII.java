package logic_Array.revision2;

public class JumpGameII {

    public static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // Update farthest reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we reach end of current jump range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        int result = jump(nums);
        System.out.println("Minimum jumps: " + result);
    }
}
