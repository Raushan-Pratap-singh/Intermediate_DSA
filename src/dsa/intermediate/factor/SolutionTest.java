package dsa.intermediate.factor;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Small prime number
        int result1 = solution.solve(7);
        System.out.println("Test Case 1: Input: 7, Expected Output: 2, Actual Output: " + result1);

        // Test case 2: Small composite number
        int result2 = solution.solve(12);
        System.out.println("Test Case 2: Input: 12, Expected Output: 6, Actual Output: " + result2);

        // Test case 3: Perfect square number
        int result3 = solution.solve(16);
        System.out.println("Test Case 3: Input: 16, Expected Output: 5, Actual Output: " + result3);

        // Test case 4: Large prime number
        int result4 = solution.solve(29);
        System.out.println("Test Case 4: Input: 29, Expected Output: 2, Actual Output: " + result4);

        // Test case 5: Large composite number
        int result5 = solution.solve(100);
        System.out.println("Test Case 5: Input: 100, Expected Output: 9, Actual Output: " + result5);

        // Test case 6: Edge case with A = 1 (smallest possible input)
        int result6 = solution.solve(1);
        System.out.println("Test Case 6: Input: 1, Expected Output: 1, Actual Output: " + result6);

        // Test case 7: Number with many factors
        int result7 = solution.solve(60);
        System.out.println("Test Case 7: Input: 60, Expected Output: 12, Actual Output: " + result7);
    }
}
