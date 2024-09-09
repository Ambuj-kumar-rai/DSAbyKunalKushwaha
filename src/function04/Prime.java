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
        System.out.println("Enter the range to get all prime number between them");
        int startNum = sc.nextInt();
        int lastNum = sc.nextInt();
        for(int i=startNum; i<=lastNum;i++)
        {
            if(primeCheck(i).equals("Prime"))
                System.out.print(i+" ");
        }

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
