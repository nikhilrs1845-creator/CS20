package SkillBuilders;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter a number");

        int initNum = userinput.nextInt();
        int num = initNum;

        int total = 1;

        while (num >= 1) {

            total = total * num;

            num = num - 1;
        }

        System.out.print(initNum + "! = " + total);
    }
}