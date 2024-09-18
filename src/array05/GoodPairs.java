package array05;

//1512. Number of Good Pairs

public class GoodPairs {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,1,3};
        SolutionGoodPairs solutionGoodPairs = new SolutionGoodPairs();
        int result = solutionGoodPairs.numIdenticalPairs(nums);
        System.out.println(result);
    }
}

class SolutionGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j] && i<j)
                    count++;
            }
        }
        return count;

    }
}
