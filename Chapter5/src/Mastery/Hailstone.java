package Mastery;

import java.util.Scanner;

/*
 * Name: Nikhil Stephenson
 * Assignment: Hailstone Sequence
 *
 * Description:
 * This program generates Hailstone sequences for a specified
 * number of consecutive positive integers. For each starting
 * integer, the program displays the sequence and counts the
 * number of iterations required to reach 4.
 *
 * The program also determines which starting integer produced
 * the longest sequence.
 */

public class Hailstone {

    /*
     * Gets a positive whole number from the user.
     * Invalid numerical and non-numerical inputs are rejected.
     */
    public static int getNumber(Scanner userInput) {

        while (true) {

            try {

                // Get a whole number from the user.
                int number = userInput.nextInt();

                // Check that the number is positive.
                if (number > 0) {
                    return number;
                }

                // Display an error if the number is not positive.
                System.out.println(
                    "Error: Please enter a positive value."
                );

            } catch (Exception e) {

                // Handle input that is not a numerical value.
                System.out.println(
                    "Error: Please enter a numerical value."
                );

                // Remove the invalid input before asking again.
                if (userInput.hasNext()) {
                    userInput.next();
                }
            }
        }
    }

    /*
     * Main method generates the Hailstone sequences, counts
     * the iterations, and determines the longest sequence.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Get the first integer to test.
        System.out.print("Enter the starting integer: ");
        int startingNumber = getNumber(userInput);

        // Get the number of consecutive integers to test.
        System.out.print("How many integers would you like to test? ");
        int numberOfTests = getNumber(userInput);

        // Store the starting number with the longest sequence.
        int longestPath = startingNumber;

        // Store the number of iterations in the longest sequence.
        int longestSteps = 0;

        /*
         * Test each consecutive integer beginning with
         * the starting number.
         */
        for (int i = 0; i < numberOfTests; i++) {

            // Calculate the next starting number to test.
            int currentStartingNumber = startingNumber + i;

            // Store the current value in the Hailstone sequence.
            int currentNumber = currentStartingNumber;

            // Count how many calculations are required.
            int stepCount = 0;

            // Display the starting number.
            System.out.print(currentStartingNumber);

            /*
             * Continue the Hailstone sequence until it reaches 4.
             *
             * If the number is even, divide it by 2.
             * If the number is odd, multiply it by 3 and add 1.
             */
            while (currentNumber != 4) {

                if (currentNumber % 2 == 0) {

                    // Even number: divide by 2.
                    currentNumber /= 2;

                } else {

                    // Odd number: multiply by 3 and add 1.
                    currentNumber = currentNumber * 3 + 1;
                }

                // Count the completed step.
                stepCount++;

                // Display the next value in the sequence.
                System.out.print(" -> " + currentNumber);
            }

            // Move to the next line after displaying the sequence.
            System.out.println();

            // Display the number of steps in the current sequence.
            System.out.println(
                currentStartingNumber
                + " took "
                + stepCount
                + " iterations."
            );

            System.out.println();

            /*
             * Check whether the current sequence is longer than
             * the longest sequence found so far.
             */
            if (stepCount > longestSteps) {

                longestSteps = stepCount;
                longestPath = currentStartingNumber;
            }
        }

        // Display the starting number with the longest sequence.
        System.out.println("Longest path:");
        System.out.println(
            longestPath
            + " took "
            + longestSteps
            + " iterations."
        );

        // Close the Scanner when the program is finished.
        userInput.close();
    }
}