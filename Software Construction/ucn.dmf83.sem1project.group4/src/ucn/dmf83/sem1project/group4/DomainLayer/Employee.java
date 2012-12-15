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
