package SkillBuilders;

import java.util.Scanner;

public class Discriminant {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = userinput.nextDouble();

        System.out.print("Enter b: ");
        double b = userinput.nextDouble();

        System.out.print("Enter c: ");
        double c = userinput.nextDouble();

        double discriminant = b * b - 4 * a * c;

        System.out.println("Discriminant: " + discriminant);

        if (discriminant > 0) {
            System.out.println("There are 2 real roots.");
        }
        else if (discriminant == 0) {
            System.out.println("There is 1 real root.");
        }
        else {
            System.out.println("There are 0 real roots.");
        }
    }
}
