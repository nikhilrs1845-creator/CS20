package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter a number");

        int num = userinput.nextInt();
        int total = 0;

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1));
            total = total + i + 1;
        }
        System.out.print("total: " + total);
    }
}