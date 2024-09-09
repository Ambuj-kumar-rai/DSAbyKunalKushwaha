package function04;
//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {5, 12, 4, 6, 13};
        boolean result = pythagoreanTriplet(arr);
        System.out.println("Pythagorean Triplet is: "+result);
    }
    static boolean pythagoreanTriplet(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j< arr.length;j++)
            {
                int sqrValue = (arr[i]*arr[i] + arr[j]*arr[j]);
                for (int value : arr) {
                    if(value*value == sqrValue)
                        return true;
                }
            }

        }
        return false;
    }
}
