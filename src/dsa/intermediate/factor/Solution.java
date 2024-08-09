package dsa.intermediate.factor;

/**
 * The Solution class provides a method to find the number of divisors (factors)
 * of a given positive integer A.
 */
public class Solution {

    /**
     * This method calculates the number of divisors of the given integer A.
     * It iterates through possible divisors from 1 up to the square root of A.
     *
     * @param A the positive integer for which the number of divisors is to be calculated
     * @return the total number of divisors of A
     */
    public int solve(int A) {
        int factors = 0; // Initialize the count of factors to 0

        // Loop through potential divisors from 1 to the square root of A
        for (int start = 1; start * start <= A; start++) {
            // Check if 'start' is a divisor of A
            if (A % start == 0) {
                // If start is the square root of A, it should be counted only once
                if (start == A / start) {
                    factors += 1; // Perfect square, count once
                } else {
                    factors += 2; // Count both divisors: start and A/start
                }
            }
        }

        // Return the total number of divisors
        return factors;
    }
}
