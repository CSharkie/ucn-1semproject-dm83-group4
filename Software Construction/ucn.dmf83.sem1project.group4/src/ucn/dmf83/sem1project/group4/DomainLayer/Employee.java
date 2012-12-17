/**
 * 
 */
package ucn.dmf83.sem1project.group4.DomainLayer;

/**
 * @author József
 *
 */
public class Employee extends User {
	
	private Location location;
	private employeeRole role;
	
	private String userName; // Used for the login screen

	public Employee(String name, int ID, Location location, employeeRole role,
			String userName) {
		super(name, ID);
		this.location = location;
		this.role = role;
		this.userName = userName;
	}
	
	
	public Employee() {
		super();
	}

	
	public Employee(String name, int ID, String userName) {
		super(name, ID);
		this.userName = userName;
	}


	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @return the role
	 */
	public employeeRole getRole() {
		return role;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(employeeRole role) {
		this.role = role;
	}
	
	
}
