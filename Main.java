public class Main {
    // Static array stores all previously computed values fibonacci sums to increase efficiency
    static  int[] fibonnaciArray = new int [1000]; 

    // Recursive method to find the sum of the first n Fibonacci numbers
    public static int fibonnaciSum(int val) {
        if (val == 1) {
            return 0;
        }
        else if (val == 2) {
            return 1;
        }
        if (fibonnaciArray[val] != 0) { // If the value has already been computed, return it
            return fibonnaciArray[val];
        }
        else { // Otherwise, compute the value and store it in the array
            fibonnaciArray[val] = fibonnaciSum(val - 1) + fibonnaciSum(val - 2) + 1;
     
            return fibonnaciArray[val];
        }
    }

    // Recurisve Method to find the gcd of the two sums using the Euclidean Algorithm
    public static int gcd(int a, int b, int i) {
        if (b == 0)
            return a;
        else {
            System.out.println("Iteration " + i +  " : " + a + " = " + b + " x " + (int)Math.floor((double)(a / b)) + " + " + a%b);
            return gcd(b, a % b, i += 1);
        }
    }

    public static void main(String[] args) {
        // Initialise Variables, note a and b are positive integers
        int a = 44; 
        int b = 45;
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
        

        // Finding Sum of the first n Fibonacci numbers
        int sumSmaller = fibonnaciSum(smallerVal);
        int sumLarger = fibonnaciSum(largerVal);

        // Printing out the results
        System.out.println("Inputs are A: " + a + " B: " + b);
        System.out.println("Sum of first " + largerVal + " fibonnaci numbers: " + sumLarger);
        System.out.println("Sum of first " + smallerVal + " fibonnaci numbers: " + sumSmaller);

        // Finding the GCD of the two sums
        int output = gcd(sumLarger, sumSmaller, 1);
        System.out.println("GCD of the two sums is: " + output);

    }
}
