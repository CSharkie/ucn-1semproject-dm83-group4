package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.TreeMap;
import java.util.Date;


public class Product extends Item{
	
	private TreeMap<Date,Integer> prices;
	
	private int currentNumber;
	
	private int minNumber;
	private int maxNumber;
	
	/**
	 * @param iD
	 * @param name
	 * @param description
	 */
	public Product(int ID, String name, String description) {
		super(ID, name, description);
	}
	
	/**
	 * @param iD
	 * @param name
	 */
	public Product(int ID, String name) {
		super(ID, name);
	}
	/**
	 * @return the currentNumber
	 */
	public int getCurrentNumber() {
		return currentNumber;
	}
	/**
	 * @return the minNumber
	 */
	public int getMinNumber() {
		return minNumber;
	}
	/**
	 * @return the maxNumber
	 */
	public int getMaxNumber() {
		return maxNumber;
	}
	/**
	 * @param currentNumber the currentNumber to set
	 */
	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}
	/**
	 * @param minNumber the minNumber to set
	 */
	public void setMinNumber(int minNumber) {
		this.minNumber = minNumber;
	}
	/**
	 * @param maxNumber the maxNumber to set
	 */
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	
	
	public void addPrice(Date date, int price)
	{
		prices.put(date, price);
	}
	
	public int getPrice(Date date)
	{
		return prices.floorEntry(date).getValue();
	}
	
	public void removePrice(Date date)
	{
		prices.remove(date);
	}
}
