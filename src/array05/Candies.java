package array05;

//1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
    List<Boolean> list = new ArrayList<>();
    int[] candies = {4,2,1,1,2};
    int extraCandies = 1;
    SolutionCandies solutionCandies = new SolutionCandies();
    list = solutionCandies.kidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }
}

class SolutionCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0; i<candies.length; i++)
        {
            if(candies[i]+extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }
    return list;
    }
}


