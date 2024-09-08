package conditionalLoops03;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principal Amount: ");
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        System.out.println("Enter the rate percentage: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time in years: ");
        float time = sc.nextFloat();

        double ci = principal * (Math.pow(1 + (rate/100), time));
        System.out.println("Compound Interest is: "+ci);

    }
}
