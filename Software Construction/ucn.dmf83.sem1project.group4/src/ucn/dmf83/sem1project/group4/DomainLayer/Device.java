package ucn.dmf83.sem1project.group4.DomainLayer;

public class Device extends Item{
	private boolean isRented;

	/**
	 * @param ID
	 * @param name
	 * @param description
	 */
	public Device(int ID, String name, String description) {
		super(ID, name, description);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param iD
	 * @param name
	 */
	public Device(int iD, String name) {
		super(iD, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the isRented
	 */
	public boolean isRented() {
		return isRented;
	}

	/**
	 * @param isRented the isRented to set
	 */
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
}
