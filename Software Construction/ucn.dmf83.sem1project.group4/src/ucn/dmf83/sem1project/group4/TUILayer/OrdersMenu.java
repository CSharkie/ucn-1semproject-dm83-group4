package ucn.dmf83.sem1project.group4.TUILayer;

import java.util.Scanner;

import ucn.dmf83.sem1project.group4.ControlLayer.*;

/**
 * @author Group 4 DM83F
 */
public class OrdersMenu {
	
	private static OrderControl orderControl;

	public static void start()
	{
		OrderMenu();
	}
	
	private static void OrderMenu()
	{
		boolean exit =false;
		while (!exit)
		{
			int choise = writeOrderMenu();
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
					new OrdersMenu();
					break;
				} 
				case 2: {
					orderSearchMenu();
					exit = true;
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
					new OrdersMenu();
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
	
	private static int writeOrderMenu()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n *** Order Menu *** ");
		System.out.println(" [1] Add new Order");
		System.out.println(" [2] Search Order");
		System.out.println(" [3] List all Orders");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choice: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	private static void orderMenu1()
	{
		boolean exit =false;
		while (!exit)
		{
			int choise = writeOrderMenu1();
			switch(choise) {
				case 1: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						// TODO Write the method
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] Add another Product.");
						String var = keyboard.nextLine();
							i=var;
					}
					orderMenu1();
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
						System.out.println(" [Enter] Add another Customer.");
						String var = keyboard.nextLine();
							i=var;
					}
					orderMenu1();
					break;
				} 
				case 0: {
					new OrdersMenu();
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
	
	private static int writeOrderMenu1()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n *** Order Add Menu *** ");
		System.out.println(" [1] Add new Product");
		System.out.println(" [2] Add new Customer");
		System.out.println(" [0] Back to Main Menu");
		System.out.println("\n\n Make your choice: ");
		int choise = keyboard.nextInt();
		return choise;
	}
	
	private static void orderSearchMenu()
	{
		boolean exit =false;
		while (!exit)
		{
			int choise = wirteOrderSearchMenu();
			switch(choise) {
				case 1: {
					String i="";
					while (!i.equals("1"))
					{
						Scanner keyboard = new Scanner(System.in);
						searchOrderID();
						System.out.println();
						System.out.println(" [1] Return ");
						System.out.println(" [Enter] Search for another Order.");
						String var = keyboard.nextLine();
							i=var;
					}
					orderSearchMenu();
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
						System.out.println(" [Enter] Search for another Order.");
						String var = keyboard.nextLine();
							i=var;
					}
					orderSearchMenu();
					break;
				}
				case 0: {
					orderSearchMenu();
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
	
	private static int wirteOrderSearchMenu()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n *** Order Search Menu *** ");
		System.out.println(" [1] Search by ID");
		System.out.println(" [2] Search by Employee");
		System.out.println(" [0] Back to Order Search Menu");
		System.out.println("\n\n Make your choice: ");
		int choise = keyboard.nextInt();
		return choise;
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
	
	public static void searchOrderID()
	{
		int ID = inputID();
		orderControl.getOrder(ID);
	}
	
}
