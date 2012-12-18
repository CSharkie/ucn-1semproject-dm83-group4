package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;
import java.util.Iterator;

public class Location {
	private int ID;
	
	private String name;
	private String address;
	
	private ArrayList<Product> stock;
	private ArrayList<Device> devices;
	
	/**
	 * @param ID
	 * @param address
	 */
	public Location(int ID, String address) {
		this.ID = ID;
		this.address = address;
		this.stock = new ArrayList<Product>();
		this.devices = new ArrayList<Device>();
	}

	/**
	 * @return the ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the address
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @param address the address to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean hasProduct(Product product)
	{
		if(stock.contains(product))
			return true;
		else
			return false;
	}
	
	public Product getProduct(int ID)
	{
		for(Iterator<Product> i = stock.iterator(); i.hasNext();) {
			Product p = i.next();
			if(p.getID() == ID)
				return p;
		}
		
		return null;
	}
	
	public void addProduct(Product p)
	{
		stock.add(p);
	}
	
	public void addDevice(Device d)
	{
		devices.add(d);
	}
	
}
