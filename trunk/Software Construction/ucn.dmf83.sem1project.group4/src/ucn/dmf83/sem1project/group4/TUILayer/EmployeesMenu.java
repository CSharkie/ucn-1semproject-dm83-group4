package ucn.dmf83.sem1project.group4.TUILayer;

import ucn.dmf83.sem1project.group4.ControlLayer.*;
import ucn.dmf83.sem1project.group4.DomainLayer.*;

import java.util.Scanner;

/**
 * @author Group 4 DM83F
 */
public class EmployeesMenu {
	
	private static EmployeeControl employeeControl;

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
						System.out.println(" [Enter] Add another Employee");
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
						System.out.println(" [Enter] Update another Employee");
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
						System.out.println(" [Enter] Remove another Employee");
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
						System.out.println(" [Enter] List again all the Emplyees");
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
						System.out.println(" [Enter] Search for another Emplyee");
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
		System.out.println("\n\n *** Employees Menu *** ");
		System.out.println(" [1] Add Employee");
		System.out.println(" [2] Update Emplyee");
		System.out.println(" [3] Remove Emplyee");
		System.out.println(" [4] List all Emplyees");
		System.out.println(" [5] Search for Emplyee");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choice: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	public static String inputName()
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Name:  ");
        String name = keyboard.nextLine();
        return name;
	}
	
	public static int inputID()
	{   
        boolean ok = false;
        int ID = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write ID:  ");
            try{
            	ID = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return ID;
    }
	
	public static String inputUserName()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println(" Write Location:  ");
		String userName = keyboard.nextLine();
		return userName;
	}
	
	
	
	// TODO Import the methods from the ControlLayer
	
}
