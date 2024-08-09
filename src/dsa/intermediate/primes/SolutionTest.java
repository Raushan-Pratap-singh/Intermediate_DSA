package dsa.intermediate.primes;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Edge case with A = 1 (not prime)
        int result1 = solution.solve(1);
        System.out.println("Test Case 1: Input: 1, Expected Output: 0, Actual Output: " + result1);

        // Test case 2: Smallest prime number
        int result2 = solution.solve(2);
        System.out.println("Test Case 2: Input: 2, Expected Output: 1, Actual Output: " + result2);

        // Test case 3: Small prime number
        int result3 = solution.solve(7);
        System.out.println("Test Case 3: Input: 7, Expected Output: 1, Actual Output: " + result3);

        // Test case 4: Small composite number
        int result4 = solution.solve(10);
        System.out.println("Test Case 4: Input: 10, Expected Output: 0, Actual Output: " + result4);

        // Test case 5: Perfect square (composite)
        int result5 = solution.solve(16);
        System.out.println("Test Case 5: Input: 16, Expected Output: 0, Actual Output: " + result5);

        // Test case 6: Large prime number
        int result6 = solution.solve(29);
        System.out.println("Test Case 6: Input: 29, Expected Output: 1, Actual Output: " + result6);

        // Test case 7: Large composite number
        int result7 = solution.solve(100);
        System.out.println("Test Case 7: Input: 100, Expected Output: 0, Actual Output: " + result7);

        // Test case 8: Prime number close to square of a number
        int result8 = solution.solve(97);
        System.out.println("Test Case 8: Input: 97, Expected Output: 1, Actual Output: " + result8);

        // Test case 9: Edge case with A = 0 (not prime)
        int result9 = solution.solve(0);
        System.out.println("Test Case 9: Input: 0, Expected Output: 0, Actual Output: " + result9);

        // Test case 10: Prime number that is one less than a perfect square
        int result10 = solution.solve(23);
        System.out.println("Test Case 10: Input: 23, Expected Output: 1, Actual Output: " + result10);
    }
}
