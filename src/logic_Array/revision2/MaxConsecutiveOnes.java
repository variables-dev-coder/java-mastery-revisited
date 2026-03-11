package logic_Array.revision2;

import java.util.*;

public class MaxConsecutiveOnes {

    public static int findMax(int[] nums){

        int count = 0;
        int max = 0;

        for(int n : nums){

            if(n == 1){
                count++;
                max = Math.max(max,count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args){

        int nums[] = {1,1,0,1,1,1};

        System.out.println(findMax(nums));
    }
}
