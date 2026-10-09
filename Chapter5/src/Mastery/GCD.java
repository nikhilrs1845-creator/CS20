package Mastery;

import java.util.Scanner;

/*
 * Name: Nikhil Stephenson
 * Course: CSE 2110 - Procedural Programming 1
 * Assignment: Greatest Common Divisor
 *
 * Description:
 * This program finds the greatest common divisor (GCD) of two
 * positive whole numbers using the Euclidean algorithm.
 */

public class GCD {

    /*
     * Gets a positive whole number from the user.
     * Rejects invalid numerical and non-numerical inputs.
     */
    public static int getNumber(Scanner userInput) {

        while (true) {
            try {
                int number = userInput.nextInt();

                if (number > 0) {
                    return number;
                }

                System.out.println(
                    "Error: Please enter a positive value."
                );

            } catch (Exception e) {
                System.out.println(
                    "Error: Please enter a whole number."
                );

                if (userInput.hasNext()) {
                    userInput.next();
                }
            }
        }
    }

    /*
     * Gets two numbers and calculates their GCD.
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = getNumber(userInput);

        System.out.print("Enter the second number: ");
        int secondNumber = getNumber(userInput);

        // Use the Euclidean algorithm to calculate the GCD.
        while (secondNumber > 0) {

            int remainder = firstNumber % secondNumber;

            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        System.out.println("GCD: " + firstNumber);

        userInput.close();
    }
}

/*
 * SCREEN DUMP:
 *
 * Test Case 1:
 * Enter the first number: 48
 * Enter the second number: 18
 * GCD: 6
 *
 * Test Case 2:
 * Enter the first number: 100
 * Enter the second number: 25
 * GCD: 25
 *
 */