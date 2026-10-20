package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

    /*
     * Converts a number of hours into minutes.
     */
    public static void hoursToMinutes(Scanner userInput) {

        System.out.println("Enter a time in hours to be converted to minutes:");

        int hours = userInput.nextInt();
        int minutes = hours * 60;

        System.out.println(hours + " hours is " + minutes + " minutes");
    }

    /*
     * Converts a number of days into hours.
     */
    public static void daysToHours(Scanner userInput) {

        System.out.println("Enter a time in days to be converted to hours:");

        int days = userInput.nextInt();
        int hours = days * 24;

        System.out.println(days + " days is " + hours + " hours");
    }

    /*
     * Converts a number of minutes into hours.
     */
    public static void minutesToHours(Scanner userInput) {

        System.out.println("Enter a time in minutes to be converted to hours:");

        int minutes = userInput.nextInt();
        float hours = minutes / 60.0f;

        System.out.println(minutes + " minutes is " + hours + " hours");
    }

    /*
     * Converts a number of hours into days.
     */
    public static void hoursToDays(Scanner userInput) {

        System.out.println("Enter a time in hours to be converted to days:");

        int hours = userInput.nextInt();
        float days = hours / 24.0f;

        System.out.println(hours + " hours is " + days + " days");
    }

    /*
     * Main method displays the conversion menu and
     * calls the method selected by the user.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner userInput = new Scanner(System.in);

        // Display the available conversions.
        System.out.println("Enter 1 for hours to minutes");
        System.out.println("Enter 2 for days to hours");
        System.out.println("Enter 3 for minutes to hours");
        System.out.println("Enter 4 for hours to days");

        // Get the user's conversion choice.
        int conversionChoice = userInput.nextInt();

        // Call the method that matches the selected conversion.
        if (conversionChoice == 1) {
            hoursToMinutes(userInput);

        } else if (conversionChoice == 2) {
            daysToHours(userInput);

        } else if (conversionChoice == 3) {
            minutesToHours(userInput);

        } else if (conversionChoice == 4) {
            hoursToDays(userInput);

        } else {
            System.out.println("Invalid choice.");
        }

        // Close the Scanner when the program ends.
        userInput.close();
    }
}