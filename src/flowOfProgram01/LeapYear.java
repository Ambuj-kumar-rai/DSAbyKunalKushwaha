package flowOfProgram01;

//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter year to check leap year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("LeapYear");
        }
        else if(year % 400 == 0)
        {
            System.out.println("LeapYear");
        }
        else
            System.out.println("Non Leap Year");

    }
}
