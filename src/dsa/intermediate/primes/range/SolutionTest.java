package dsa.intermediate.primes.range;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Prime number 2
        int result1 = solution.solve(2);
        System.out.println("Test Case 1: Input: 2, Expected Output: 1, Actual Output: " + result1);

        // Test case 2: Non-prime number 10
        int result2 = solution.solve(10);
        System.out.println("Test Case 2: Input: 10, Expected Output: 4, Actual Output: " + result2);

        // Test case 3: Prime number 11
        int result3 = solution.solve(11);
        System.out.println("Test Case 3: Input: 11, Expected Output: 5, Actual Output: " + result3);

        // Test case 4: Larger number 30
        int result4 = solution.solve(30);
        System.out.println("Test Case 4: Input: 30, Expected Output: 10, Actual Output: " + result4);

        // Test case 5: Number 1 (edge case)
        int result5 = solution.solve(1);
        System.out.println("Test Case 5: Input: 1, Expected Output: 0, Actual Output: " + result5);

        // Test case 6: Number 0 (edge case)
        int result6 = solution.solve(0);
        System.out.println("Test Case 6: Input: 0, Expected Output: 0, Actual Output: " + result6);

        // Test case 7: Large number 100
        int result7 = solution.solve(100);
        System.out.println("Test Case 7: Input: 100, Expected Output: 25, Actual Output: " + result7);

        // Test case 8: Large prime number 97
        int result8 = solution.solve(97);
        System.out.println("Test Case 8: Input: 97, Expected Output: 25, Actual Output: " + result8);

        // Test case 9: Number 50
        int result9 = solution.solve(50);
        System.out.println("Test Case 9: Input: 50, Expected Output: 15, Actual Output: " + result9);

        // Test case 10: Number 3 (small prime number)
        int result10 = solution.solve(3);
        System.out.println("Test Case 10: Input: 3, Expected Output: 2, Actual Output: " + result10);
    }
}
