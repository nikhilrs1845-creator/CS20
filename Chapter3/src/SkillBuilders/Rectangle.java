package SkillBuilders;

import java.util.Scanner;

public class Rectangle
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

        // Request length
        System.out.print("Please enter a length\n");
        float length = GetNumber(userinput);

        // Request width
        System.out.print("Please enter a width\n");
        float width = GetNumber(userinput);
        
        // Display output
        System.out.print("Area is: " + length * width +
                "\nDiagonal Length is: " + Math.sqrt(length * length + width * width) +
                "\nPerimeter is: " + (2 * length + 2 * width));
    }
}