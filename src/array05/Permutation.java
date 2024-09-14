package array05;

//1920. Build Array from Permutation
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {

        int[] nums = {5,0,1,2,3,4};
        Solution solution = new Solution();
        int[] resultArray = solution.buildArray(nums);
        System.out.println(Arrays.toString(resultArray));

    }

}

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++ )
        {
            int result = nums[i];
            ans[i] = nums[result];
        }
        return ans;
    }
}