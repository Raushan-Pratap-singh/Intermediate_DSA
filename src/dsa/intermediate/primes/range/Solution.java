package dsa.intermediate.primes.range;

/**
 * The Solution class provides a method to count the total number of prime numbers up to and including a given integer A.
 *
 * The method uses the Sieve of Eratosthenes algorithm for efficiently finding all prime numbers up to a given limit.
 *
 * Author: Raushan K Singh
 */
public class Solution {

    /**
     * This method calculates the total number of prime numbers up to and including the given integer A.
     *
     * It utilizes the Sieve of Eratosthenes algorithm, which is an efficient way to find all primes less than or equal to a given limit.
     *
     * @param A the integer limit up to which primes are counted
     * @return the total number of prime numbers less than or equal to A
     */
    public int solve(int A) {
        // Edge case: No prime number <= 1
        if (A <= 1) {
            return 0;
        }

        // Boolean array to mark non-prime numbers
        boolean[] sieve = new boolean[A + 1];

        // Loop through each number from 2 to sqrt(A)
        for (int num = 2; num * num <= A; num++) {
            // If num is a prime number
            if (!sieve[num]) {
                // Mark all multiples of num as non-prime
                for (int multiple = num * num; multiple <= A; multiple += num) {
                    sieve[multiple] = true;
                }
            }
        }
        // Count the total number of primes
        int totalPrimeNumbers = 0;
        for (int index = 2; index <= A; index++) {
            if (!sieve[index]) {
                totalPrimeNumbers++;
            }
        }
        return totalPrimeNumbers;
    }
}