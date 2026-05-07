package logic_Array.revisionPrefix_Suffix;

public class EquilibriumIndex {

    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            // Check equilibrium
            if (leftSum == rightSum) {

                System.out.println("Equilibrium Index: " + i);

                return;
            }

            leftSum += nums[i];
        }

        System.out.println("No Equilibrium Index");
    }
}
