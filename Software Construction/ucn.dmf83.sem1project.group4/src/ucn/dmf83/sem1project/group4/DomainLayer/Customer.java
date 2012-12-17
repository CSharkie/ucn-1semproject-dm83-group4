package ucn.dmf83.sem1project.group4.DomainLayer;

public class Customer extends User {
	
	private int discount;
	private customerGroup group;
	
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ID
	 */
	public Customer(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param ID
	 */
	public Customer(String name, int ID) {
		super(name, ID);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @return the group
	 */
	public customerGroup getGroup() {
		return group;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(customerGroup group) {
		this.group = group;
	}
	
	public Customer getCustomer() {
		return this;
	}
	
}
