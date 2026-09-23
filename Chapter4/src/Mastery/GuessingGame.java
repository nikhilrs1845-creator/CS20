package Mastery;

import java.util.Scanner;

public class GuessingGame {

    // Get a number within a specified range
    public static float GetNumber(Scanner userinput, int min, int max)
    {
        while (true)
        {
            try
            {
                // Get input
                float number = userinput.nextFloat();

                // Check if number is within range
                if (number >= min && number <= max)
                    return number;

                // Display error message
                System.out.println("Error: Please enter a number between "
                        + min + " and " + max + ".");
            }

            // If a non-numerical value is entered
            catch (Exception e)
            {
                System.out.println("Error: Please enter a numerical value.");

                if (userinput.hasNext())
                {
                    userinput.next();
                }
            }
        }
    }

    // Run main code
    public static void main(String[] args)
    {
        // Create a Scanner Object
        Scanner userinput = new Scanner(System.in);

        int go = 1;

        while (go == 1)
        {
            int result = 0;

            // Get player and computer choices
            System.out.print("Enter a number between 1 and 20:\n");
            int player = (int)GetNumber(userinput, 1, 20);

            // Generate random number between 1 and 20
            int com = (int)(Math.random() * 20) + 1;

            // Calculate result
            if (player == com)
            {
                result = 1;
            }

            System.out.println("\nPlayer picked " + player);
            System.out.println("Computer picked " + com + "\n");

            // Find result and display output
            String[] results = {"You lose!", "You win!"};
            System.out.println(results[result] + "\n");

            // Ask to play again
            System.out.println("Would you like to play again?");
            System.out.println("Enter 1 for yes and 0 for no");

            go = (int)GetNumber(userinput, 0, 1);
        }
    }
}