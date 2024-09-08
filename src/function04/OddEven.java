package function04;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String result = oddEven(num1);
        System.out.println(result);

    }
    static String oddEven(int num)
    {
        if(num%2==0)
            return "Even Number";
        else
            return "Odd Number";
    }
}
