package SkillBuilders;

import java.util.Scanner;

public class OddSum {
	
	public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter a number");

        int num = userinput.nextInt();

        int total = 0;
        
        for (int i = 1; i <= num; i=i+2) {

            System.out.print(i + " ");
            total = total + i;
        }
        
        System.out.println("Total: " + total);
    }
}
