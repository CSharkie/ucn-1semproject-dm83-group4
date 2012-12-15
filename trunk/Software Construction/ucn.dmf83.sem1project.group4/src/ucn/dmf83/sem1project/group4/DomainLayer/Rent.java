package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.Date;

public class Rent {
	private int ID;
	
	private Customer customer;
	private Employee renter;
	private Device device;
	
	private Date startDate;
	private int length;
	private Date endDate;
	
	private double rentPrice;
	private int discount;
	private double finalPrice;
	
	/**
	 * @param iD
	 * @param customer
	 * @param renter
	 * @param device
	 * @param startDate
	 * @param length
	 */
	public Rent(int ID, Customer customer, Employee renter, Device device,
			Date startDate, int length) {
		this.ID = ID;
		this.customer = customer;
		this.renter = renter;
		this.device = device;
		this.startDate = startDate;
		this.length = length;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the renter
	 */
	public Employee getRenter() {
		return renter;
	}

	/**
	 * @return the device
	 */
	public Device getDevice() {
		return device;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param renter the renter to set
	 */
	public void setRenter(Employee renter) {
		this.renter = renter;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(Device device) {
		this.device = device;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
