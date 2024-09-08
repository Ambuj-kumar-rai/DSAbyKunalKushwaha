package firstJavaProgram02;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        System.out.println("Enter the principal amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        System.out.println("Enter the rate percentage");
        float rate = sc.nextFloat();
        System.out.println("Enter the rate time");
        float time = sc.nextFloat();

        float si = amount * rate * time/ 100;
        System.out.println("Your total Interest will be: "+si);



    }
}
