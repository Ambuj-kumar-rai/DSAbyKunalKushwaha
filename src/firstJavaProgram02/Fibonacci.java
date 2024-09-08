package firstJavaProgram02;

//To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        System.out.println(firstNum);
        System.out.println(secondNum);
        int fibonacciTerms = 10;
        for(int i=0; i < fibonacciTerms; i++)
        {
            int nextNum = firstNum+secondNum;
            System.out.println(nextNum);
            firstNum = secondNum;
            secondNum = nextNum;

        }
    }
}
