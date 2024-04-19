import java.util.Scanner;
import java.lang.Math; 

public class Main {

    // Recursive Method to find the gcd of the two sums using the Euclidean Algorithm
    public static long gcd(long sumLarger, long sumSmaller, int i) {
        if (sumSmaller == 0)
            return sumLarger;
        else {
            System.out.println("Iteration " + i +  " : " + sumLarger + " = " + sumSmaller + " x " + (int)Math.floor((double)(sumLarger / sumSmaller)) + " + " + sumLarger%sumSmaller);
            return gcd(sumSmaller, sumLarger % sumSmaller, i += 1);
        }
    }

    // Method to get valid input from the user
    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;
        System.out.println("Please enter an integer between 1 and 68 (inclusive): ");

        // Loop to check for valid input (integer between 1 and 68 inclusive)
        while (valid == false) {
            try {
                input = scanner.nextInt(); // Get the input
                if (input > 68 || input < 0) {
                    System.out.println("Please make sure inputs are between 1 and 68 (inclusive)");
                }
                else {
                    System.out.println("Valid input");
                    valid = true;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer");
                scanner.next(); 
            }
        }
        return input;
    }

    // Method to find the sum of the first n Fibonacci numbers
    public static long sumFibonacci(int n) {
        double x = Math.pow((1 + Math.sqrt(5)),n+1);
        double y = Math.pow((1 - Math.sqrt(5)),n+1);
        double z = Math.pow(2,n + 1) * Math.sqrt(5);
        long sum = (long)((x - y) / z) - 1;
        // Formula =  ((1 + sqrt(5))^n+1 - (1 - sqrt(5))^n+1 ) - 1)/ (sqrt(5)) * 2^n+1)
        
        return sum;
    }


    public static void main(String[] args) {                
        int a = getValidInput(); 
        int b = getValidInput();
        int largerVal;
        int smallerVal;

        // Determine if a is larger than b
        if (a >= b) {
            largerVal = a;
            smallerVal = b;
        }
        else {
            largerVal = b;
            smallerVal = a;
        }

        // Using the formula for the sum of the first n Fibonacci numbers
        long sumLarger = sumFibonacci(largerVal);
        long sumSmaller = sumFibonacci(smallerVal);

        // Printing out the results
        System.out.println("Inputs are A: " + a + " B: " + b);
        System.out.println("Sum of first " + largerVal + " Fibonacci numbers: " + sumLarger);
        System.out.println("Sum of first " + smallerVal + " Fibonacci numbers: " + sumSmaller);
        System.out.println("Iteration n:  a = b x q + r");

        // Finding the GCD of the two sums
        long output = gcd(sumLarger, sumSmaller, 1);
        System.out.println("GCD of the two sums is: " + output);
        
    }
}
