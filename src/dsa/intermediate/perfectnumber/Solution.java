package dsa.intermediate.perfectnumber;

/**
 * The Solution class provides a method to determine if a given integer is a perfect number.
 *
 * A perfect number is defined as a positive integer that is equal to the sum of its proper divisors
 * (excluding the number itself). This class contains the logic to identify such numbers efficiently.
 *
 * Author: Raushan K Singh
 */
public class Solution {

    /**
     * This method checks if the given integer A is a perfect number.
     *
     * A perfect number is a number that is equal to the sum of its proper divisors.
     * The method returns 1 if A is a perfect number, and 0 otherwise.
     *
     * @param A the integer to check
     * @return 1 if A is a perfect number, otherwise 0
     */
    public int solve(int A) {
        // Edge case: 1 is not a perfect number
        if (A == 1) {
            return 0;
        }

        int perfectNumber = 0; // Initialize the sum of divisors to 0

        // Loop to find all proper divisors of A
        for (int start = 1; start <= A / 2; start++) {
            // If start is a divisor of A, add it to the sum
            if (A % start == 0) {
                perfectNumber += start;
            }
        }

        // Check if the sum of proper divisors equals A
        return perfectNumber == A ? 1 : 0;
    }
}
