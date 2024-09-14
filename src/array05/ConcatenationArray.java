package array05;

//1929. Concatenation of Array
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
    int[] nums = {1,3,2,1};
    SolutionConcatenationArray solutionConcatenationArray = new SolutionConcatenationArray();
    int[] resultArr = solutionConcatenationArray.getConcatenation(nums);
        System.out.println(Arrays.toString(resultArr));
    }
}

class SolutionConcatenationArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length *2];
        for(int i =0; i<nums.length; i++)
        {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }

        return ans;
    }
}


