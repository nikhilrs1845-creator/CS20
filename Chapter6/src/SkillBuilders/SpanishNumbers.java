package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers {

    /*
     * Displays the Spanish word for a number from 1 to 10.
     */
    public static void displaySpanish(int number) {

        if (number == 1) {
            System.out.println("Uno");
        } else if (number == 2) {
            System.out.println("Dos");
        } else if (number == 3) {
            System.out.println("Tres");
        } else if (number == 4) {
            System.out.println("Cuatro");
        } else if (number == 5) {
            System.out.println("Cinco");
        } else if (number == 6) {
            System.out.println("Seis");
        } else if (number == 7) {
            System.out.println("Siete");
        } else if (number == 8) {
            System.out.println("Ocho");
        } else if (number == 9) {
            System.out.println("Nueve");
        } else if (number == 10) {
            System.out.println("Diez");
        } else {
            // Display an error if the number is outside the valid range.
            System.out.println("Invalid number");
        }
    }

    /*
     * Main method gets a number from the user
     * and displays its Spanish translation.
     */
    public static void main(String[] args) {

        // Create