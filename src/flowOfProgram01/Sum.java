package flowOfProgram01;

//Take two numbers and print the sum of both.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
