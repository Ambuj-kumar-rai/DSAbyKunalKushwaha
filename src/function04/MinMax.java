package function04;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maxResult = max(num1, num2, num3);
        int minResult = min(num1, num2, num3);
        System.out.println("Largest number is "+maxResult);
        System.out.println("Smallest number is "+minResult);
    }

    static int max(int num1, int num2, int num3)
    {
        if(num1 > num2 && num1 > num3)
        {
            return num1;
        }
        else if (num2 > num1 && num2 > num3)
        {
            return  num2;
        }
        else
            return num3;
    }

    static int min(int num1, int num2, int num3)
    {
        if(num1 < num2 && num1 < num3)
        {
            return num1;
        }
        else if (num2 < num1 && num2 < num3)
        {
            return  num2;
        }
        else
            return num3;
    }
}
