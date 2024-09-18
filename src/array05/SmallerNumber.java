package array05;

//1365. How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
    int[] nums = {6,5,4,8};
    SolutionSmalllerNumber solutionSmalllerNumber = new SolutionSmalllerNumber();
    int[] result = solutionSmalllerNumber.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}

class SolutionSmalllerNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int count = 0;
            for(int j=0; j<nums.length; j++)
            {
                if(j !=i && nums[j] < nums[i])
                    count++;

            }
            ans[i] = count;
        }
        return ans;

    }
}
