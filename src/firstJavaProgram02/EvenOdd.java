package firstJavaProgram02;

//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
