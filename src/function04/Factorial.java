package function04;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter a number to get factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of "+num+" is: "+result);
    }
    static int factorial(int num)
    {
        int factorialResult = 1;
        if(num == 0 || num == 1)
            return factorialResult;
        else
        {
            for(int i=1; i<=num; i++)
            {
                factorialResult *= i;
            }
        }
        return factorialResult;
    }
}
