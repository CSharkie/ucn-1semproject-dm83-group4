package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.TreeMap;
import java.util.Date;


public class Product extends Item{
	
	private TreeMap<Date, Integer> stockPrices;
	private TreeMap<Date,Integer> salesPrices;
	
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
		stockPrices = new TreeMap<Date,Integer>();
		salesPrices = new TreeMap<Date,Integer>();
	}
	
	/**
	 * @param iD
	 * @param name
	 */
	public Product(int ID, String name) {
		super(ID, name);
		stockPrices = new TreeMap<Date,Integer>();
		salesPrices = new TreeMap<Date,Integer>();
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
		salesPrices.put(date, price);
	}
	
	public int getPrice(Date date)
	{
		return salesPrices.floorEntry(date).getValue();
	}
	
	public void removePrice(Date date)
	{
		salesPrices.remove(date);
		checkStock();
	}
	
	public void sell(Integer amount) {
		currentNumber -= amount;
	}
	
	public void buy(Integer amount) {
		currentNumber += amount;
	}
	
	
	public void checkStock()
	{
		if(currentNumber <= minNumber ) {
			//reorder
		}
	}
}
