package ucn.dmf83.sem1project.group4.DomainLayer;

public class customerGroup {
	private int ID;
	
	private String name;
	private int discount;
	
	
	/**
	 * @param iD
	 * @param name
	 */
	public customerGroup(int iD, String name) {
		ID = iD;
		this.name = name;
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
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
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
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
