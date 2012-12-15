package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.Date;

/**
 * 
 */

/**
 * @author József Király
 *
 */
public class User {
	private int ID;
	
	private String name;
	private Date DoB;
	
	private String address;
	private int postalCode;
	private String city;
	
	private String phoneNum;
	private String email;
	
	
	public User()
	{
		
	}
	
	public User(int ID)
	{
		this.ID = ID;
	}
	
	/**
	 * @param name
	 */
	public User(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}
	
	
	/**
	 * @return the ID
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
	 * @return the doB
	 */
	public Date getDoB() {
		return DoB;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	
	/**
	 * @param ID the ID to set
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param doB the doB to set
	 */
	public void setDoB(Date doB) {
		DoB = doB;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
}
