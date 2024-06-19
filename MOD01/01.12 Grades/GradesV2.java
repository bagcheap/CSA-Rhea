/**
 * This class documents the code assignment for Pitfalls, Shortcuts through the
 * GradesV2 application. It computes the total and average grade.
 *
 * @author Rhea Bagchee
 * @version 1.0
 * @since 2024-06-11
 */

public class GradesV2 {

    /**
     * The main method of the application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // local variables
        int numTests = 0; // counts number of tests
        int testGrade = 0; // individual test score
        int totalPoints = 0; // total points for all tests
        double average = 0.0; // average grade

        // Test #1; score 95
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #2; score 73
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #3; score 91
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #4; score 82
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #5; score 78
        numTests++;
        testGrade = 78;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #6; score 92
        numTests++;
        testGrade = 92;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #7; score 87
        numTests++;
        testGrade = 87;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #8; score 98
        numTests++;
        testGrade = 98;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);

        // Test #9; score 75
        numTests++;
        testGrade = 75;
        totalPoints += testGrade;

        average = (double) totalPoints / numTests;

        // print results
        System.out.println("Test #" + numTests + "; \tScore: " + testGrade
                + "; \tTotal Points: " + totalPoints + "; \tAverage Score: " + average);
    }
}