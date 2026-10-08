package Mastery;

import java.util.Scanner;

/*
 * Name: Nikhil Stephenson
 * Course: CSE 2110 - Procedural Programming 1	
 * Assignment: Greatest Common Divisor
 *
 * Description:
 * This program finds the greatest common divisor (GCD) of two
 * positive whole numbers entered by the user. The Euclidean
 * algorithm is used to repeatedly find the remainder until
 * the second number becomes zero.
 */

public class GCD {

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

            }

            // Handle input that is not a numerical value.
            catch (Exception e) {

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
     * Main method gets two numbers and uses the Euclidean
     * algorithm to calculate their greatest common divisor.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Get the first number.
        System.out.print("Enter the first number: ");
        int firstNumber = getNumber(userInput);

        // Get the second number.
        System.out.print("Enter the second number: ");
        int secondNumber = getNumber(userInput);

        /*
         * Continue calculating remainders until the second number
         * becomes zero. The remaining value in firstNumber is
         * the greatest common divisor.
         */
        while (secondNumber > 0) {

            int remainder = firstNumber % secondNumber;

            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        // Display the greatest common divisor.
        System.out.println("GCD: " + firstNumber);

        // Close the Scanner when the program is finished.
        userInput.close();
    }
}