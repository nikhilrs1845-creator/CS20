package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

    /*
     * Calculates the base raised to an integer exponent.
     */
    public static double powerOf(double base, int exponent) {

        double result = 1;

        // Multiply the base by itself for each exponent value.
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    /*
     * Main method gets the base and exponent,
     * then displays the calculated result.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Get the base from the user.
        System.out.print("Enter the first number (base): ");
        double base = userInput.nextDouble();

        // Get the exponent from the user.
        System.out.print("Enter the second number (exponent): ");
        int exponent = userInput.nextInt();

        // Calculate and display the result.
        double result = powerOf(base, exponent);

        System.out.println(base + "^" + exponent + " = " + result);

        // Close the Scanner when the program ends.
        userInput.close();
    }
}