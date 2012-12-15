package ucn.dmf83.sem1project.group4.DomainLayer;

public class employeeRole {
	private int ID;
	
	private String roleName;
	private boolean hasElevatedRights;
	
	/**
	 * @param roleName
	 * @param hasElevatedRights
	 */
	public employeeRole(String roleName, boolean hasElevatedRights) {
		this.roleName = roleName;
		this.hasElevatedRights = hasElevatedRights;
	}
	
	
	
	
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @return the hasElevatedRights
	 */
	public boolean HasElevatedRights() {
		return hasElevatedRights;
	}

	
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * @param hasElevatedRights the hasElevatedRights to set
	 */
	public void setHasElevatedRights(boolean hasElevatedRights) {
		this.hasElevatedRights = hasElevatedRights;
	}
	
	
}
