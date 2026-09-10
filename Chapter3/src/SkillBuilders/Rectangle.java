package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		//Create A Scanner Object
		Scanner userinput = new Scanner(System.in);
		
		//Define Variables "length" and "width" and Request Values
		System.out.print("Please enter a length\n");
		float length = userinput.nextFloat();
		System.out.print("Please enter a width\n");
		float width = userinput.nextFloat();
		
		//Display Width and Length On The Console
		System.out.print("Area is: "+length*width);
		System.out.print("\nDiagonal Length is: "+Math.sqrt(length*length+width*width));
		
		userinput.close();
	}

}

