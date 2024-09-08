package flowOfProgram01;

//Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" * "+i+" = "+num*i);
        }
    }
}
