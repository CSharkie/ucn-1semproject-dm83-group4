package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeContainer {
	
private ArrayList<Employee> employees;
private ArrayList<employeeRole> employeeRoles;
	
	private static EmployeeContainer instance = null;

	protected EmployeeContainer() {
		
	}

	public static EmployeeContainer getInstance() {
		if (instance == null) {
			instance = new EmployeeContainer();
		}
		return instance;
	}
	
	public void addEmployee(Employee emp)
	{
		employees.add(emp);
	}
	
	public void removeEmployee(Employee emp)
	{
		employees.remove(emp);
	}
	
	public Employee getEmployee(int ID)
	{
		for(Iterator<Employee> i = employees.iterator(); i.hasNext();)
		{
			Employee ct = i.next();
			if(ct.getID() == ID)
				return ct;
		}
		
		return null;
	}
	
	public boolean checkID(int ID)
    {
        for(Employee employee: employees)
        {
            if(employee.getID() == ID)
            return false;
        }
        return true;
    }
	
	public void addEmployeeRole(employeeRole emprole)
	{
		employeeRoles.add(emprole);
	}
	
	public void removeEmployeeRole(employeeRole emprole)
	{
		employeeRoles.remove(emprole);
	}
	
	public employeeRole getEmployeeRole(int ID)
	{
		for(employeeRole emp : employeeRoles)
		{
			if(emp.getID() == ID)
				return emp;
		}
		
		return null;
	}
	
	public void createEmployee(String name, int ID, Location location, employeeRole role, String userName)
	{
		if(checkID(ID)==false) {
			System.out.println("ID already exists.");
		} else {
			Employee employee = new Employee(name, ID, location, role, userName);
			addEmployee(employee);
		}
	}
	
	public void removeEmloyee(int ID)
	{
		if(getEmployee(ID)==null)
		{
			System.out.println("Emplyee ID doesn't exists.");
		} else {
			Employee employee = getEmployee(ID);
			employees.remove(employee);
		}
	}

}
