package ucn.dmf83.sem1project.group4.TUILayer;

import java.util.Scanner;

import ucn.dmf83.sem1project.group4.ControlLayer.*;

/**
 * @author Group 4 DM83F
 */
public class ContractorsMenu {

	public static void start()
	{
		ContractorMenu();
	}
	
	private static void ContractorMenu()
	{
		boolean exit =false;
		while (!exit)
		{
			int choise = writeContractorMenu();
			switch(choise) {
				case 1: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] Add another Contractor");
						String var = keyboard.nextLine();
							i=var;
					}
					new ContractorsMenu();
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
						System.out.println(" [Enter] Update another Contractor");
						String var = keyboard.nextLine();
							i=var;
					}
					new ContractorsMenu();
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
						System.out.println(" [Enter] Remove another Contractor");
						String var = keyboard.nextLine();
							i=var;
					}
					new ContractorsMenu();
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
						System.out.println(" [Enter] List all Contractors");
						String var = keyboard.nextLine();
							i=var;
					}
					new ContractorsMenu();
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
						System.out.println(" [Enter] Search for another Contractor");
						String var = keyboard.nextLine();
							i=var;
					}
					new ContractorsMenu();
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
	
	private static int writeContractorMenu()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n *** Contractors Menu *** ");
		System.out.println(" [1] Add Contractor");
		System.out.println(" [2] Update Contractor");
		System.out.println(" [3] Remove Contractor");
		System.out.println(" [4] List all CContractors");
		System.out.println(" [5] Search for Contractor");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choice: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	// TODO Import the methods from the ControlLayer

}
