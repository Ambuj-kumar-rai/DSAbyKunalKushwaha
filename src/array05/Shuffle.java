package array05;

//1470. Shuffle the Array

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
    int[] nums = {2,5,1,3,4,7};
    int length = nums.length/2;
        System.out.println(length);
    SolutionShuffle solutionShuffle = new SolutionShuffle();
    int[] result = solutionShuffle.shuffle(nums, length);
        System.out.println(Arrays.toString(result));
    }
}


class SolutionShuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i=0;
        int count = 0;
        while(i<n*2)
        {
            ans[i] = nums[count];
            i++;
            ans[i] = nums[n+count];
            count++;
            i++;
        }
        return ans;
    }
}