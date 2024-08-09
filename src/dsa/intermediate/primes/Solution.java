package dsa.intermediate.primes;

/**
 * The Solution class provides a method to determine if a given integer is a prime number.
 * A prime number is defined as a natural number greater than 1 that has no positive divisors
 * other than 1 and itself.
 */
public class Solution {

    /**
     * This method checks if the given integer A is a prime number.
     *
     * A prime number has exactly two distinct positive divisors: 1 and the number itself.
     * The method returns 1 if A is prime, and 0 otherwise.
     *
     * @param A the integer to check
     * @return 1 if A is a prime number, otherwise 0
     */
    public int solve(int A) {
        // Edge case: 1 or any number less than 1 is not a prime number
        if (A <= 1) {
            return 0;
        }

        // Edge case: 2 is the smallest prime number
        if (A == 2) {
            return 1;
        }

        // Check divisibility from 2 to sqrt(A)
        for (int start = 2; start * start <= A; start++) {
            // If A is divisible by any number other than 1 and itself, it's not prime
            if (A % start == 0) {
                return 0;  // A is not a prime number
            }
        }

        // If no divisors were found in the loop, A is a prime number
        return 1;
    }
}

