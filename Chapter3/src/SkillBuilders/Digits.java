package SkillBuilders;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        // Create A Scanner Object
        Scanner userinput = new Scanner(System.in);

        // Ask for number
        System.out.print("Please enter a number: ");

        int Num = 0;

        // Loop until a positive numerical value is given
        while (true) {

            try {

                // Get input
                Num = userinput.nextInt();

                // Check if number is positive
                if (Num >= 0)
                    break;

                // If not positive, display error message and loop
                System.out.println("Error: Please enter a positive value");

            }

            // If a non-numerical value is presented, display error message and loop
            catch (Exception e) {

                System.out.println("Error: Please enter a numerical value.");

                if (userinput.hasNext()) {
                    userinput.next();
                }
            }
        }

        String numString = String.valueOf(Num);

        // Find length
        int length = numString.length();

        // Loop for length of the number
        for (int i = 0; i < length; i++) {

        	// Get relevant digit
            int digit = Character.getNumericValue(numString.charAt(i));

            // Print output in format "3 x 100 = 300"
            System.out.println(digit + " x "
                    + Math.pow(10, length - i - 1)
                    + " = "
                    + (digit * Math.pow(10, length - i - 1)));
        }
    }
}