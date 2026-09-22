package Mastery;

import java.util.Scanner;

public class CompoundIntrest
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

        // Gets all necessary input
        System.out.print("Enter the principal ($): ");
        float principal = GetNumber(userinput);
        
        System.out.print("Enter the period (months): ");
        float months = GetNumber(userinput) / 12;
        
        System.out.print("Enter the intrest rate (%): ");
        float rate = GetNumber(userinput) / 100;
        
        System.out.print("Enter the compounding frequency (days): ");
        float freq = 365 / GetNumber(userinput);

        // Calculates total
        float total = (float) (principal * Math.pow(1 + rate / freq, freq * months));
        
        // Display output
        System.out.printf("The value after the term is $%.2f", total);
    }
}