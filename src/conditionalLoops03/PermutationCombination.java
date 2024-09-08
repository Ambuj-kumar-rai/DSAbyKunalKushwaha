package conditionalLoops03;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        System.out.println("Enter two number to find NcR and NpR");
        Scanner sc = new Scanner(System.in);
        int totalNumber = 6;
        int selectedNumber = 2;
        int permutationResult = 1;
        int factorialSelectedNumber = 1;
        for(int i=1; i<= selectedNumber; i++ )
        {
            permutationResult *= totalNumber;
            factorialSelectedNumber *= i;
            totalNumber--;
        }
        System.out.println("Permutation result is: "+permutationResult);

        int combinationResult = permutationResult/factorialSelectedNumber;
        System.out.println("Combination result is: "+combinationResult);
    }
}
