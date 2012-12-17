package ucn.dmf83.sem1project.group4.ControlLayer;

import ucn.dmf83.sem1project.group4.DomainLayer.*;

/**
 * @author Group 4 DM83F
 */
public class EmployeeControl {
	
	/**
	 * instance variables
	 */
	private EmployeeContainer employee;
	
	public EmployeeControl()
	{
		employee = EmployeeContainer.getInstance();
	}
	
	public void createEmployee(String name, int ID, Location location, employeeRole role, String userName)
	{
		employee.createEmployee(name, ID, location, role, userName);
	}
	
	public void removeEmplyee(int ID)
	{
		employee.removeEmloyee(ID);
	}

}
