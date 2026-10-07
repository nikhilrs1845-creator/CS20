package Mastery;

import java.util.Scanner;

/*
 * Name: Nikhil Stephenson
 * Course: CSE2140 - 2nd Language Programming
 * Assignment: Volume Calculator
 *
 * Description:
 * This program calculates the volume of different 3D shapes.
 * The user selects a shape and enters the required measurements.
 * The program then calculates and displays the volume.
 */

public class VolumeCalc {

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

            }

            // Handle input that is not a numerical value.
            catch (Exception e) {

                System.out.println(
                    "Error: Please enter a numerical value."
                );

                // Remove the invalid input before asking again.
                if (userInput.hasNext()) {
                    userInput.next();
                }
            }
        }
    }

    /*
     * Main method controls the shape selection, measurements,
     * volume calculations, and program loop.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Stores whether the user wants to continue.
        int continueProgram = 1;

        // Continue running while the user enters 1.
        while (continueProgram == 1) {

            // Display the available shapes.
            System.out.println("\nEnter 1 for Rectangular Prism");
            System.out.println("Enter 2 for Sphere");
            System.out.println("Enter 3 for Cube");
            System.out.println("Enter 4 for Triangular Prism");

            // Get and validate the user's shape selection.
            int shapeChoice = (int) getNumber(userInput, 1, 4);

            // Calculate the volume of a rectangular prism.
            if (shapeChoice == 1) {

                System.out.print("\nLength: ");
                float length = getNumber(userInput, 1, 999999);

                System.out.print("Width: ");
                float width = getNumber(userInput, 1, 999999);

                System.out.print("Height: ");
                float height = getNumber(userInput, 1, 999999);

                // Calculate volume using length × width × height.
                float volume = length * width * height;

                System.out.println("\nVolume: " + volume);
            }

            // Calculate the volume of a sphere.
            else if (shapeChoice == 2) {

                System.out.print("\nRadius: ");
                float radius = getNumber(userInput, 1, 999999);

                // Calculate volume using the sphere volume formula.
                float volume = (float) (
                    (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
                );

                System.out.println("\nVolume: " + volume);
            }

            // Calculate the volume of a cube.
            else if (shapeChoice == 3) {

                System.out.print("\nSide Length: ");
                float sideLength = getNumber(userInput, 1, 999999);

                // Calculate volume by cubing the side length.
                float volume = sideLength * sideLength * sideLength;

                System.out.println("\nVolume: " + volume);
            }

            // Calculate the volume of a triangular prism.
            else if (shapeChoice == 4) {

                System.out.print("\nTriangle Base: ");
                float triangleBase = getNumber(userInput, 1, 999999);

                System.out.print("Triangle Height: ");
                float triangleHeight = getNumber(userInput, 1, 999999);

                System.out.print("Prism Length: ");
                float prismLength = getNumber(userInput, 1, 999999);

                // Calculate the area of the triangular base.
                float triangleArea = 0.5f * triangleBase * triangleHeight;

                // Multiply the triangle area by the prism length.
                float volume = triangleArea * prismLength;

                System.out.println("\nVolume: " + volume);
            }

            // Ask the user whether they want to calculate another volume.
            System.out.println("\nWould you like to continue?");
            System.out.println("Enter 1 for yes and 0 for no:");

            // Get and validate the user's choice.
            continueProgram = (int) getNumber(userInput, 0, 1);
        }

        System.out.println("Program ended.");
    }
}