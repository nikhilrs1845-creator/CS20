package Mastery;

import java.util.Scanner;

public class Change {

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

            // If a non-numerical value is presented
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

        // Get input
        System.out.print("Enter the dollar amount: ");
        float dollars = GetNumber(userinput);

        // Convert dollars to cents
        int cents = Math.round(dollars * 100);

        // Calculate coins
        int toonies = cents / 200;
        cents = cents % 200;

        int loonies = cents / 100;
        cents = cents % 100;

        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int nickels = cents / 5;
        cents = cents % 5;

        // Display output
        System.out.println("toonies: " + toonies);
        System.out.println("loonies: " + loonies);
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("extra: " + cents + " cents");
    }
}