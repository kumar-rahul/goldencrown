package test;

import java.util.InputMismatchException;
import java.util.Scanner;

import kingdom.Controller.Controller;

public class GoldenCrown {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		Controller ctrl = new Controller();
		
	    while(true){
		    System.out.println("List Operations");
		    System.out.println("===============");
		    System.out.println("1.Who is the ruler of Southeros?");
		    System.out.println("2.Allies of Ruler?");
		    System.out.println("3.Input Messages to kingdoms from King Shan?\n(NOTE: Type 'SEND' to send messages)");
		    System.out.println("4.Allies of King Shan?");
		    System.out.println("5.Exit\n");
		    System.out.println("Enter your choice : ");
		    
	        try {
			    int in = scan.nextInt();
				ctrl.callService(in);
	        } catch (InputMismatchException e) {
	            System.out.print("INVALID CHOICE! Enter only an Integer.\n");
	        }
		    scan.nextLine();
	    }
		
	}
}
