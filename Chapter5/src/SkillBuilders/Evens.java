package SkillBuilders;

import java.util.Scanner;

public class Evens {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.println("How many even numbers would you like?");

        int num = userinput.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print((i + 1) * 2 + " ");
        }
    }
}