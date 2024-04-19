import java.util.Scanner;

public class Main {

    // Recursive Method to find the gcd of the two sums using the Euclidean Algorithm
    public static int gcd(int a, int b, int i) {
        if (b == 0)
            return a;
        else {
            System.out.println("Iteration " + i +  " : " + a + " = " + b + " x " + (int)Math.floor((double)(a / b)) + " + " + a%b);
            return gcd(b, a % b, i += 1);
        }
    }

    // Method to get valid input from the user
    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;
        System.out.println("Please enter an integer between 1 and 45 (inclusive): ");

        // Loop to check for valid input (integer between 1 and 45 inclusive)
        while (valid == false) {
            try {
                input = scanner.nextInt(); // Get the input
                if (input > 45 || input < 0) {
                    System.out.println("Please make sure inputs are between 1 and 45 (inclusive)");
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

        // Using the sumOfnFibonnaci class
        sumOfnFibonnaci sum = new sumOfnFibonnaci(largerVal, smallerVal);
        int[] sums = sum.findSum();
        int sumLarger = sums[0];
        int sumSmaller = sums[1];

        // Printing out the results
        System.out.println("Inputs are A: " + a + " B: " + b);
        System.out.println("Sum of first " + largerVal + " Fibonacci numbers: " + sumLarger);
        System.out.println("Sum of first " + smallerVal + " Fibonacci numbers: " + sumSmaller);
        System.out.println("Iteration n:  a = b x q + r");

        // Finding the GCD of the two sums
        int output = gcd(sumLarger, sumSmaller, 1);
        System.out.println("GCD of the two sums is: " + output);
        
    }
}
