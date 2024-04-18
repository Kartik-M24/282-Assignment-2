public class sumOfnFibonnaci {
    // Set up fields
    private int largerVal;
    private int smallerVal;
    private int sum;

    // Initialize the constructor
    public sumOfnFibonnaci(int val1, int val2) {
        this.largerVal = val1;
        this.smallerVal = val2;
    }

    // Method to find the sum of the first n Fibonacci numbers
    public int[] findSum() {        
        // Initialise local values
        int[] sums = new int[2];
        int a = 0;
        int b = 1;
        int c;
        
        // Determining Sums of smallerVal and largerVal
        if (smallerVal == 1){
            sums[1] = 0;
        }
        if (smallerVal == 2){
            sums[1] = 1;
        }

        if (largerVal == 1){
             sums[0] = 0;
        }
        else if (largerVal == 2){
            sums[0] = 1;
        }
        else {
            sum = 1;
            for(int i = 0; i < largerVal-2; i++){
                // Checking if we are at the smallerVal
                if (i == smallerVal-2){
                    sums[1] = sum;
                }
                // Calculates next Fibonacci value and adds this to the sum
                c = a + b;
                sum += c;
                a = b;
                b = c;
            }
            sums[0] = sum;
        }
        return sums;
    }
    
}
