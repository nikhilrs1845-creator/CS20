package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userinput.nextInt();

        double squareRoot = Math.sqrt(number);

        if (squareRoot == (int)squareRoot) {
            System.out.println(number + " is a perfect square.");
        }
        else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}