package ucn.dmf83.sem1project.group4.TUILayer;

import java.util.Scanner;

public class EmployeesMenu {

	public static void start()
	{
		EmployeeMenu();
	}
	
	private static void EmployeeMenu()
	{
		boolean exit =false;
		while (!exit)
		{
			int choise = writeEmployeeMenu();
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
					new EmployeesMenu();
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
						System.out.println(" [Enter] ");
						String var = keyboard.nextLine();
							i=var;
					}
					new EmployeesMenu();
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
						System.out.println(" [Enter] ");
						String var = keyboard.nextLine();
							i=var;
					}
					new EmployeesMenu();
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
						System.out.println(" [Enter] ");
						String var = keyboard.nextLine();
							i=var;
					}
					new EmployeesMenu();
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
						System.out.println(" [Enter] ");
						String var = keyboard.nextLine();
							i=var;
					}
					new EmployeesMenu();
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
	
	private static int writeEmployeeMenu()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n *** Employee Menu *** ");
		System.out.println(" [1] Add Employee");
		System.out.println(" [2] Update Emplyee");
		System.out.println(" [3] Remove Emplyee");
		System.out.println(" [4] List all Emplyee");
		System.out.println(" [5] Search for Emplyee");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choise: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	// TODO Import the methods from the ControlLayer
	
}
