package SkillBuilders;

import java.util.Scanner;

public class DisplayBox {

    /*
     * Displays one horizontal bar using the specified character.
     */
    public static void drawBar(int length, String character) {

        for (int i = 1; i <= length; i++) {
            System.out.print(character);
        }

        System.out.println();
    }

    /*
     * Main method gets the box dimensions and character,
     * then draws the box.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Get the length and width of the box.
        System.out.print("Enter a length: ");
        int length = userInput.nextInt();

        System.out.print("Enter a width: ");
        int width = userInput.nextInt();
        userInput.nextLine();

        // Ask whether the user wants to choose a custom character.
        System.out.print("Do you want a custom character? (y/n): ");
        String choice = userInput.nextLine();

        // Use O as the default character.
        String character = "O";

        if (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter a character: ");
            String customCharacter = userInput.nextLine();

            // Keep the default if no character is entered.
            if (!customCharacter.isEmpty()) {
                character = customCharacter;
            }
        }

        // Draw each row of the box.
        for (int i = 1; i <= width; i++) {
            drawBar(length, character);
        }

        // Close the Scanner when the program ends.
        userInput.close();
    }
}