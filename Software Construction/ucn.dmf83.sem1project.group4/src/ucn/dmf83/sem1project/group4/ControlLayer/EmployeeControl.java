package ucn.dmf83.sem1project.group4.ControlLayer;

import ucn.dmf83.sem1project.group4.DomainLayer.*;

/**
 * @author Group 4 DM83F
 */
public class EmployeeControl {
	
	/**
	 * instance variables
	 */
	private EmployeeContainer employeeContainer;
	private Employee employee;
	
	public EmployeeControl()
	{
		employeeContainer = EmployeeContainer.getInstance();
	}
	
	public void createEmployee(String name, int ID, Location location, employeeRole role, String userName)
	{
		employeeContainer.createEmployee(name, ID, location, role, userName);
	}
	
	public void removeEmployee(int ID)
	{
		employeeContainer.removeEmloyee(ID);
	}
	
	public void updateEmployeeLocation(Location location)
	{
		employee.setLocation(location);
	}
	
	public void updateEmployeeRole(employeeRole role)
	{
		employee.setRole(role);
	}
	
	public void updateEmployeeUserName(String userName)
	{
		employee.setUserName(userName);
	}

}
