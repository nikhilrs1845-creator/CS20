package SkillBuilders;

import java.util.Scanner;

public class RockPaperScissors {

	// Define a new function
		public static float GetNumber(Scanner userinput)
	    {
	        // Loop until a positive numerical value is given
			while (true)
	        {
	            try
	            {
	            	// Get input
	                float number = userinput.nextFloat();

	                // Check if number is between 1 and 3
	                if (number >= 1 && number <= 3)
	                    return number;

	                // If not between 1 and 3, display error message and loop
	                System.out.println("Error: Please enter 1, 2, or 3.");
	            }
	            // If a non- numerical value is presented, display error message and loop
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
	        // Create A Scanner Object
	        Scanner userinput = new Scanner(System.in);
	        
	        // Create a list of possible choices numbered 0-2
	        String[] choices = {"Rock", "Paper", "Scissors"};

	        // Get player and computer choices
	        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:\n");
	        int player = (int) GetNumber(userinput) - 1;
	        int com = (int) (Math.random() * 3);

	        System.out.println("Player picked " + choices[player]);
	        System.out.println("Computer picked " + choices[com]);

	        //Calculate result by subtracting computer choice from player choice, adding 3 to get rid of negative results, and then finding the remainder when divided by 3
	        int result = (player - com + 3) % 3;

	        //Find results (0-2) on list and display output
	        String[] results = {"Tie!", "You win!", "You lose!"};
	        System.out.println(results[result]);
	    }
}
