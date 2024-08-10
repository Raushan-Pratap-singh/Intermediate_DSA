package dsa.intermediate.perfectnumber;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Perfect number 6
        int result1 = solution.solve(6);
        System.out.println("Test Case 1: Input: 6, Expected Output: 1, Actual Output: " + result1);

        // Test case 2: Perfect number 28
        int result2 = solution.solve(28);
        System.out.println("Test Case 2: Input: 28, Expected Output: 1, Actual Output: " + result2);

        // Test case 3: Non-perfect number 10
        int result3 = solution.solve(10);
        System.out.println("Test Case 3: Input: 10, Expected Output: 0, Actual Output: " + result3);

        // Test case 4: Non-perfect number 12
        int result4 = solution.solve(12);
        System.out.println("Test Case 4: Input: 12, Expected Output: 0, Actual Output: " + result4);

        // Test case 5: Large perfect number 496
        int result5 = solution.solve(496);
        System.out.println("Test Case 5: Input: 496, Expected Output: 1, Actual Output: " + result5);

        // Test case 6: Edge case with A = 1 (not a perfect number)
        int result6 = solution.solve(1);
        System.out.println("Test Case 6: Input: 1, Expected Output: 0, Actual Output: " + result6);

        // Test case 7: Edge case with A = 2 (not a perfect number)
        int result7 = solution.solve(2);
        System.out.println("Test Case 7: Input: 2, Expected Output: 0, Actual Output: " + result7);

        // Test case 8: Non-perfect large number 1000
        int result8 = solution.solve(1000);
        System.out.println("Test Case 8: Input: 1000, Expected Output: 0, Actual Output: " + result8);

        // Test case 9: Perfect number 8128
        int result9 = solution.solve(8128);
        System.out.println("Test Case 9: Input: 8128, Expected Output: 1, Actual Output: " + result9);

        // Test case 10: Non-perfect number that is close to a perfect number 27
        int result10 = solution.solve(27);
        System.out.println("Test Case 10: Input: 27, Expected Output: 0, Actual Output: " + result10);

        // Test case 10: Non-perfect number that is close to a perfect number 27
        int result11 = solution.solve(60);
        System.out.println("Test Case 10: Input: 60, Expected Output: 0, Actual Output: " + result11);

        // Test case 10: Non-perfect number that is close to a perfect number 27
        int result12 = solution.solve(77);
        System.out.println("Test Case 10: Input: 60, Expected Output: 0, Actual Output: " + result12);
    }
}
