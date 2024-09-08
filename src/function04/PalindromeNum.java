package function04;
//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Enter a number to get factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean palindromeResult = palindrome(num);
        if(palindromeResult)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Plaindrome number");
        }
    }
    static boolean palindrome(int num)
    {
        int copyNum = num;
        int result = 0;
        while(num>0)
        {
            int reminder = num%10;
            result = (result * 10) + reminder;
            num /= 10;
        }
        if(copyNum == result)
            return true;
        else
            return false;
    }
}
