package conditionalLoops03;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int perfectSum = 0;
        for(int i=1; i<=num/2; i++)
        {
           if(num%i==0)
           {
               perfectSum += i;
           }
        }
        if(num == perfectSum)
        {
            System.out.println("Perfect Number");
        }
        else
            System.out.println("Not a perfect Number");
    }
}
