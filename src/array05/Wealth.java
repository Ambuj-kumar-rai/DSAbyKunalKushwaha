package array05;

public class Wealth {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3}, {3,2,1},{4,5,6,7}};
        SolutionWealth solutionWealth = new SolutionWealth();
        int result = solutionWealth.maximumWealth(accounts);
        System.out.println(result);

    }
}


class SolutionWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++)
        {
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++)
            {
                sum += accounts[i][j];
            }
            if(sum>max)
                max = sum;
        }
        return max;
    }
}
