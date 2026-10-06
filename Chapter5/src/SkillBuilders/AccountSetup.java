package SkillBuilders;

import java.util.Scanner;

public class AccountSetup {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter a user name: ");
        
        String username = userinput.nextLine().toLowerCase();
        

        String password = " ";
        
        while (true) {
            System.out.println("Please enter a password (at least 8 characters): ");
            
            password = userinput.nextLine();
            
            if (password.length() >= 8) {
            	
            	break;
            }
        }
        
        System.out.println("Username: " + username);
        
        System.out.println("Password: " + password.toLowerCase());
		
	}
}
