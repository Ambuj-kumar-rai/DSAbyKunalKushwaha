package firstJavaProgram02;

//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyNum = num;
        int result=0;
        int count=0;
        while(num > 0)
        {
            count++;
            num /= 10;
        }
        num = copyNum;
        while(num>0)
        {
            int reminder = num%10;
            int powerValue = 1;
            for(int i=0; i< count; i++)
            {
                powerValue *= reminder;
            }
            result += powerValue;
            num /= 10;
        }
        if(result == copyNum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
