package ucn.dmf83.sem1project.group4.DomainLayer;

public class Item {
	
	private int ID;
	
	private String name;
	private String description;
	
	/**
	 * @param iD
	 * @param name
	 */
	public Item(int iD, String name) {
		ID = iD;
		this.name = name;
	}

	/**
	 * @param iD
	 * @param name
	 * @param description
	 */
	public Item(int iD, String name, String description) {
		ID = iD;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
}
