package Mastery;

import java.util.Scanner;

public class VolumeCalc {

    // Get a number within a specified range
    public static float GetNumber(Scanner userinput, int min, int max) {

        while (true) {

            try {

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
            catch (Exception e) {

                System.out.println("Error: Please enter a numerical value.");

                if (userinput.hasNext()) {
                    userinput.next();
                }
            }
        }
    }

    // Run main code
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner userinput = new Scanner(System.in);

        int go = 1;

        while (go == 1) {

            // Get shape choice
            System.out.println("\nEnter 1 for Rectangular Prism");
            System.out.println("Enter 2 for Sphere");
            System.out.println("Enter 3 for Cube");
            System.out.println("Enter 4 for Triangular Prism");

            int choice = (int) GetNumber(userinput, 1, 4);

            // Rectangular Prism
            if (choice == 1) {

                System.out.print("\nLength: ");
                float length = GetNumber(userinput, 1, 999999);

                System.out.print("Width: ");
                float width = GetNumber(userinput, 1, 999999);

                System.out.print("Height: ");
                float height = GetNumber(userinput, 1, 999999);

                float volume = length * width * height;

                System.out.println("\nVolume: " + volume);
            }

            // Sphere
            else if (choice == 2) {

                System.out.print("\nRadius: ");
                float radius = GetNumber(userinput, 1, 999999);

                float volume = (float) ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));

                System.out.println("\nVolume: " + volume);
            }

            // Cube
            else if (choice == 3) {

                System.out.print("\nSide Length: ");
                float side = GetNumber(userinput, 1, 999999);

                float volume = side * side * side;

                System.out.println("\nVolume: " + volume);
            }

            // Triangular Prism
            else if (choice == 4) {

                System.out.print("\nTriangle Base: ");
                float base = GetNumber(userinput, 1, 999999);

                System.out.print("Triangle Height: ");
                float triangleHeight = GetNumber(userinput, 1, 999999);

                System.out.print("Prism Length: ");
                float prismLength = GetNumber(userinput, 1, 999999);

                float volume = (0.5f * base * triangleHeight) * prismLength;

                System.out.println("\nVolume: " + volume);
            }

            // Ask to continue
            System.out.println("\nWould you like to continue?");
            System.out.println("Enter 1 for yes and 0 for no");

            go = (int) GetNumber(userinput, 0, 1);
        }

        userinput.close();
    }
}