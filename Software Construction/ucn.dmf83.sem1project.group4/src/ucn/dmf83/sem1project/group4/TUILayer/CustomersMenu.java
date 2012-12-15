package ucn.dmf83.sem1project.group4.TUILayer;

import java.util.Scanner;

import ucn.dmf83.sem1project.group4.ControlLayer.*;

/**
 * @author Group 4 DM83F
 */
public class CustomersMenu {
	
	public static void start()
	{
		CustomerMenu();
	}
	
	private static void CustomerMenu()
	{
		boolean exit =false;
		while (!exit)
		{
			int choise = writeCustomerMenu();
			switch(choise) {
				case 1: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] ");
						String var = keyboard.nextLine();
							i=var;
					}
					new CustomersMenu();
					break;
				} 
				// TODO Write the rest of the menu options
				case 0: {
					MainMenu.mainMenuStart();
					exit = true;
					break;
				}
				default: {
					System.out.println("\n Invalid selection, please try again! ");
					break;
				}
			}
		}
	}
	
	private static int writeCustomerMenu()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n *** Customers Menu *** ");
		System.out.println(" [1] ");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choise: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	// TODO Import the methods from the ControlLayer

}
