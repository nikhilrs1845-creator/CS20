package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

    public static void hoursToMinutes(Scanner input) {

        System.out.println("Enter a time in hours to be converted to minutes");

        int hours = input.nextInt();

        int minutes = hours * 60;

        System.out.println(hours + " hours is " + minutes + " minutes");
    }

    public static void daysToHours(Scanner input) {

        System.out.println("Enter a time in days to be converted to hours");

        int days = input.nextInt();

        int hours = days * 24;

        System.out.println(days + " days is " + hours + " hours");
    }

    public static void minutesToHours(Scanner input) {

        System.out.println("Enter a time in minutes to be converted to hours");

        int minutes = input.nextInt();

        float hours = minutes / 60.0f;

        System.out.println(minutes + " minutes is " + hours + " hours");
    }

    public static void hoursToDays(Scanner input) {

        System.out.println("Enter a time in hours to be converted to days");

        int hours = input.nextInt();

        float days = hours / 24.0f;

        System.out.println(hours + " hours is " + days + " days");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for hours to minutes");
        System.out.println("Enter 2 for days to hours");
        System.out.println("Enter 3 for minutes to hours");
        System.out.println("Enter 4 for hours to days");

        int choice = input.nextInt();

        if (choice == 1) {

            hoursToMinutes(input);

        } else if (choice == 2) {

            daysToHours(input);

        } else if (choice == 3) {

            minutesToHours(input);

        } else if (choice == 4) {

            hoursToDays(input);

        } else {

            System.out.println("Invalid choice.");
        }

        input.close();
    }
}