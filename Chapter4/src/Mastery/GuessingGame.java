package Mastery;

import java.util.Scanner;

/*
 * Name: Nikhil Stephenson
 * Course: CSE2140 - 2nd Language Programming
 * Assignment: Guessing Game
 *
 * Description:
 * This program allows the user to play a guessing game against
 * the computer. The user selects a number from 1 to 20, and the
 * computer randomly selects a number from the same range.
 * The user wins if both numbers match.
 */

public class GuessingGame {

    /*
     * Gets a number from the user and checks that it is
     * within the specified minimum and maximum values.
     */
    public static float getNumber(Scanner userInput, int minimum, int maximum) {

        while (true) {

            try {

                // Get a number from the user.
                float number = userInput.nextFloat();

                // Check if the number is within the accepted range.
                if (number >= minimum && number <= maximum) {
                    return number;
                }

                // Display an error if the number is outside the range.
                System.out.println(
                    "Error: Please enter a number between "
                    + minimum + " and " + maximum + "."
                );

            } catch (Exception e) {

                // Handle input that is not a numerical value.
                System.out.println("Error: Please enter a numerical value.");

                // Remove the invalid input before asking again.
                if (userInput.hasNext()) {
                    userInput.next();
                }
            }
        }
    }

    /*
     * Main method controls the game and allows the user
     * to play multiple rounds.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Stores whether the user wants to play another round.
        int playAgain = 1;

        // Continue the game while the user chooses to play again.
        while (playAgain == 1) {

            // Store the player's and computer's guesses.
            int playerGuess;
            int computerGuess;

            // Stores the result: 0 = lose, 1 = win.
            int gameResult = 0;

            // Ask the player for a number between 1 and 20.
            System.out.println("Enter a number between 1 and 20:");
            playerGuess = (int) getNumber(userInput, 1, 20);

            // Generate a random number between 1 and 20.
            computerGuess = (int) (Math.random() * 20) + 1;

            // Compare the player's guess with the computer's guess.
            if (playerGuess == computerGuess) {
                gameResult = 1;
            }

            // Display the numbers selected by the player and computer.
            System.out.println("\nPlayer picked " + playerGuess);
            System.out.println("Computer picked " + computerGuess + "\n");

            // Store the possible results using the gameResult index.
            String[] results = {"You lose!", "You win!"};

            // Display the result of the round.
            System.out.println(results[gameResult] + "\n");

            // Ask the player whether they want to play again.
            System.out.println("Would you like to play again?");
            System.out.println("Enter 1 for yes and 0 for no:");

            playAgain = (int) getNumber(userInput, 0, 1);
        }

        // Close the Scanner when the program is finished.
        userInput.close();

        System.out.println("Thanks for playing!");
    }
}

/*
 * SCREEN DUMP:
 *
 * Test Case 1:
 *
 * Enter a number between 1 and 20:
 * 7
 *
 * Player picked 7
 * Computer picked 12
 *
 * You lose!
 *
 * Would you like to play again?
 * Enter 1 for yes and 0 for no:
 * 0
 * Thanks for playing!
 *
 *
 * Test Case 2:
 *
 * Enter a number between 1 and 20:
 * 15
 *
 * Player picked 15
 * Computer picked 15
 *
 * You win!
 *
 * Would you like to play again?
 * Enter 1 for yes and 0 for no:
 * 0
 * Thanks for playing!
 *
 */