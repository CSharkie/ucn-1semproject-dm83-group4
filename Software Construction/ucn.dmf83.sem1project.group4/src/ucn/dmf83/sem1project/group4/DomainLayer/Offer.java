package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.Date;
import java.util.TreeMap;

public class Offer {
	private int ID;
	
	private Contractor contractor;
	
	private Date startDate;
	private Date endDate;
	
	private TreeMap<Product,Integer> offeredProducts;

	/**
	 * @param iD
	 * @param contractor
	 * @param startDate
	 * @param endDate
	 */
	public Offer(int iD, Contractor contractor, Date startDate, Date endDate) {
		ID = iD;
		this.contractor = contractor;
		this.startDate = startDate;
		this.endDate = endDate;
		
		offeredProducts = new TreeMap<Product,Integer>();
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the contractor
	 */
	public Contractor getContractor() {
		return contractor;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @param contractor the contractor to set
	 */
	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public void addProduct(Product product, Integer amount)
	{
		offeredProducts.put(product, amount);
	}
	
	public void removeProduct(Product product)
	{
		offeredProducts.remove(product);
	}
	
	public void modifyPrice(Product product, Integer newPrice)
	{
		Product oldProduct = product;
		product.addPrice(new Date(), newPrice);
		offeredProducts.put(product, offeredProducts.get(oldProduct));
	}
	
	public void modifyAmount(Product product, Integer amount)
	{
		offeredProducts.put(product, amount);
	}
	
}
