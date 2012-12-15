package ucn.dmf83.sem1project.group4.TUILayer;

import java.util.Scanner;

import ucn.dmf83.sem1project.group4.ControlLayer.*;

/**
 * @author Group 4 DM83F
 */
public class MainMenu {
	
	private static OrdersMenu orders;
	private static DepartmentsMenu department;
	private static ContractorsMenu contractor;
	private static CustomersMenu customer;
	private static EmployeesMenu emplyee;
	
	/**
     * Method to start the main UI
     */
	public static void main(String[] args) 
	{
		mainMenuStart();
	}
    
    public static void mainMenuStart()
    {
    	boolean exit = false;
    	while(!exit)
    	{
    		int choise = writeMainMenu();
    		switch(choise) {
    		case 1:
    		{
    			startOrderMenu();
    			exit = true;
    			break;
    		}
    		case 2:
    		{
    			startEmplyeeMenu();
    			exit = true;
    			break;
    		}
    		case 3:
    		{
    			startContractorMenu();
    			exit = true;
    			break;
    		}
    		case 4:
    		{
    			startCustomerMenu();
    			exit = true;
    			break;
    		}
    		case 0:
    		{
    			writeEnd();
    			exit = true;
    			break;
    		}
    		default:
    		{
    			System.out.println("\n Invalid selection, please try again! ");
    			break;
    		}
    		}
    	}
    }
    
    /**
     * Method that writes the options of the menu
     */
    private static int writeMainMenu()
    {       
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("\n *** MainMenu ***");
    	System.out.println(" [1] Orders Menu");
    	System.out.println(" [2] Emplyees Menu");
    	System.out.println(" [3] Contractors Menu");
    	System.out.println(" [4] Customers Menu");
    	System.out.println(" [5] Departments Menu");
    	System.out.println(" [0] Close");
    	System.out.print("\n Make your choise: ");
    	int choise = keyboard.nextInt();
    	return choise;
    }
    
    /**
     * Method to start the Orders Menu
     */
    private static void startOrderMenu()
    {
    	orders.start();
    }

    /**
     * Method to start the Products Menu
     */
    private static void startEmplyeeMenu()
    {
    	emplyee.start();
    }

    /**
     * Method to start the Contractors Menu
     */
    private static void startContractorMenu()
    {
    	contractor.start();
    }

    /**
     * Method to start the Customers Menu
     */
    private static void startCustomerMenu()
    {
    	customer.start();
    }
    
    /**
     * Method to start the Departments Menu
     */
    private static void startDepartmentMenu()
    {
    	department.start();
    }
    
    /**
     * Method to write the shutting down message
     */
    private static void writeEnd()
    {
        System.out.println("\n The System is shutting down. ");
    }

}
