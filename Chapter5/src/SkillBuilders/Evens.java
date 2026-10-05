package SkillBuilders;

import java.util.Scanner;

public class Evens {
	
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("How many even numbers would you like?");
	num = userinput.nextInt();
	
	for (int i = 0; i <= num; i++) {
		System.out.print((i+1)*2);
	}
}
