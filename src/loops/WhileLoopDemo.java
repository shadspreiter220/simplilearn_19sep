package loops;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		int PINinDB = 1234;
		int tries = 0;
		//Class object = new Class
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter your ATM PIN");
         int PINentered = k.nextInt();
         tries++;
         
          while((PINentered != PINinDB) && tries<3) {
        	  System.out.println("PIN is incorrect. Please try again");
        	  PINentered = k.nextInt();
          }
          
          System.out.println("Welcome to ABC Bank");

}

}