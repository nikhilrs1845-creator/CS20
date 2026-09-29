package SkillBuilders;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the minimum: ");
        int min = userinput.nextInt();

        System.out.print("Enter the maximum: ");
        int max = userinput.nextInt();

        int number = random.nextInt(max - min + 1) + min;

        System.out.println("Random number: " + number);
    }
}