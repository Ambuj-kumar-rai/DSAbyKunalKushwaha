package function04;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter your age in years");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String result = votingEligibility(num1);
        System.out.println(result);

    }
    static String votingEligibility(int num)
    {
        if(num >= 18)
            return "Welcome!!\nYou are eligible for voting";
        else
            return "OOPs!!\nYou are not eligible for voting";
    }

}
