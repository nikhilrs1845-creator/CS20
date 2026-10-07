package SkillBuilders;

import java.util.Scanner;

public class PercentPassing {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        int totalGrades = 0;
        int passingGrades = 0;

        final String FLAG = "!";

        System.out.println("Enter grades one at a time.");
        System.out.println("Enter ! when you are finished.");

        while (true) {

            System.out.print("Enter a grade: ");

            String input = userinput.nextLine();

            if (input.equals(FLAG)) {
                break;
            }

            int grade = Integer.parseInt(input);

            totalGrades++;

            if (grade > 70) {
                passingGrades++;
            }
        }

        if (totalGrades > 0) {

            double percentPassing = (double) passingGrades / totalGrades * 100;

            System.out.println("Percent passing: " + percentPassing + "%");

        } else {

            System.out.println("No grades were entered.");
        }
    }
}