package SkillBuilders;

import java.util.Scanner;

public class GradeAvg
{
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

                // Check if number is positive
                if (number >= 0)
                	return number;

                // If not positive, display error message and loop
                System.out.println("Error: Please enter a positive value");
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

        // Request input for number of grades to be processed
        System.out.print("How many grades would you like to input?\n");
        int numGrades = (int) GetNumber(userinput);
        
        // Set up variable for later use
        float total = 0;
        
        // Asks for values to calculate average
        for (int i = 0; i < numGrades; i++) {
        	
        	System.out.print("Please enter grade number " + (i+1) + "(%): \n");
        	
        	float grade = GetNumber(userinput);
        	
        	total = total + grade;
        	
        }

        
        // Displays and calculates output
        System.out.print("Grade average is " + (total/numGrades) + "%");
    }
}