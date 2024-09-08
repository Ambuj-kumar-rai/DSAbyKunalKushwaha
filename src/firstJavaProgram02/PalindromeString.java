package firstJavaProgram02;

//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String compareString="";
        int stringLength = userInput.length();
        for (int i = stringLength-1;  i >= 0 ; i--) {

            compareString += userInput.charAt(i);
        }
        if(userInput.equals(compareString))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a palindorme String");
    }
}
