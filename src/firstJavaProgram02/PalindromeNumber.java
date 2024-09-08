package firstJavaProgram02;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyNum = num;
        int result = 0;
        while(num>0)
        {
            int reminder = num%10;
            System.out.println("reminder: "+reminder);
            result = (result * 10) + reminder;
            System.out.println("result: "+result);
            num /= 10;
            System.out.println("num: "+num);
        }
        System.out.println(result);

        if(result == copyNum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Non Palindrome Number");
    }
}
