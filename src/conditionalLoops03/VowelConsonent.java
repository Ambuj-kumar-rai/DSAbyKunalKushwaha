package conditionalLoops03;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        System.out.println("Enter a alphabetical character");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().trim().charAt(0);
        if((character >= 65 && character <= 90) || (character >= 97 && character <= 122))
        {
            switch (character) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("Consonent");
            }
        }
        else
            System.out.println("Please enter a valid Character");
        }
    }
