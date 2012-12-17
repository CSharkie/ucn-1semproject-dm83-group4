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
						System.out.println(" [Enter] Add another Customer");
						String var = keyboard.nextLine();
							i=var;
					}
					new CustomersMenu();
					break;
				} 
				case 2: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] Update another customer");
						String var = keyboard.nextLine();
							i=var;
					}
					new CustomersMenu();
					break;
				}
				case 3: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] Remove another Customer");
						String var = keyboard.nextLine();
							i=var;
					}
					new CustomersMenu();
					break;
				} 
				case 4: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] List again all Customers");
						String var = keyboard.nextLine();
							i=var;
					}
					new CustomersMenu();
					break;
				} 
				case 5: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] Search for another Customer");
						String var = keyboard.nextLine();
							i=var;
					}
					new CustomersMenu();
					break;
				} 
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
		System.out.println(" [1] Add Customer");
		System.out.println(" [2] Update Customer");
		System.out.println(" [3] Remove Customer");
		System.out.println(" [4] List all Customers");
		System.out.println(" [5] Search for Customer");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choice: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	// TODO Import the methods from the ControlLayer

}
