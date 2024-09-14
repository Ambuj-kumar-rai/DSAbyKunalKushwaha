package array05;

//1480. Running Sum of 1d Array

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        SolutionSum solutionSum = new SolutionSum();
        int[] result = solutionSum.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}

class SolutionSum {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++)
        {
            nums[i] = nums[i-1] + nums[i];
        }

        return nums;
    }
}