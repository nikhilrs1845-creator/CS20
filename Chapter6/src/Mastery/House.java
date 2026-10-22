package Mastery;

public class House {

    /*
     * Draws the triangular roof with a flat bottom edge.
     */
    public static void addRoof() {

        System.out.println("     /\\");
        System.out.println("    /  \\");
        System.out.println("   /    \\");
        System.out.println("  /      \\");
        System.out.println(" /        \\");

        // Draw the bottom edge of the roof.
        System.out.print("/");

        for (int i = 0; i < 10; i++) {
            System.out.print("_");
        }

        System.out.println("\\");
    }

    /*
     * Draws the walls and bottom edge of the house.
     */
    public static void addBase() {

        // Draw the three rows of walls.
        for (int row = 0; row < 3; row++) {

            System.out.print("|");

            for (int column = 0; column < 10; column++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }

        // Draw the bottom edge of the house.
        System.out.print("|");

        for (int i = 0; i < 10; i++) {
            System.out.print("_");
        }

        System.out.println("|");
    }

    /*
     * Draws a walkway centered underneath the house.
     */
    public static void addWalk() {

        // Draw the top of the walkway.
        System.out.println("     **");

        // Center the walkway underneath the house.
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    /*
     * Main method draws the roof, house base, and walkway.
     */
    public static void main(String[] args) {

        addRoof();
        addBase();
        addWalk();
    }
}

/*
 * SCREEN DUMP:
 *
 * Test Case 1:
 *
 *      /\
 *     /  \
 *    /    \
 *   /      \
 *  /        \
 * /__________\
 * |          |
 * |          |
 * |          |
 * |__________|
 *      **
 *      **********
 *
 */