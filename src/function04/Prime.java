package function04;

//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = primeCheck(num);
        System.out.println(result);

    }
    static String primeCheck(int num)
    {
        int startNum = 2;
        while(startNum*startNum <= num)
        {
            if(num%startNum == 0)
            {
                return "Not prime";
            }
            startNum++;
        }
        return "Prime";
    }
}
