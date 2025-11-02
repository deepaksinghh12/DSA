public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153;           // The number to be checked.
        int temp = num;          // Store the original number (153) for the final comparison.
        int sum = 0;             // Initialize the variable to accumulate the sum of powered digits.
        int digits = 0;          // Initialize the counter for the total number of digits..
        
        // Use a separate variable 'n' for counting and calculation loops to preserve 'num' and 'temp'.
        int n = num;
        // Count digits
        // We must know the number of digits (the power 'p') before we can calculate the sum.
        while (n > 0) {
            digits++;     // Increment the count for each digit found.
            n /= 10;      // Integer division by 10 removes the last digit (e.g., 153 -> 15 -> 1 -> 0).
        } 
        // After this loop, 'digits' holds the count (e.g., 3 for 153), and 'n' is 0.
        // Calculate sum of powers
        // Reset 'n' back to the original number to start the process of extracting digits again.
        n = num; 
        
        while (n > 0) {
            // Extract the last digit (Remainder when divided by 10)
            int rem = n % 10; // For 153: rem = 3, then 5, then 1. 

            // Calculate the power and add it to the total sum.
            // Math.pow(base, exponent) is used, where base is 'rem' and exponent is 'digits'.
            // Note: Math.pow returns a double, so it is automatically cast/added as an int to 'sum'.
            sum += Math.pow(rem, digits); 

            // Remove the last digit to process the next one.
            n /= 10;      // For 153: n = 15, then 1, then 0.
        }
        // After this loop, 'sum' holds the calculated total (e.g., 153).// Calculate sum of powers
        // Reset 'n' back to the original number to start the process of extracting digits again.
        n = num; 
        
        // Final check: Compare the calculated sum with the original number.
        if (sum == temp)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is NOT an Armstrong number");
    }
}