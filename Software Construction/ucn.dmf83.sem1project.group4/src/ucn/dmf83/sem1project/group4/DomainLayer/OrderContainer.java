package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderContainer {
	
private ArrayList<Order> orders;
	
	private static OrderContainer instance = null;

	protected OrderContainer() {
		orders = new ArrayList<Order>();
	}

	public static OrderContainer getInstance() {
		if (instance == null) {
			instance = new OrderContainer();
		}
		return instance;
	}
	
	public void addOrder(Order order)
	{
		orders.add(order);
	}
	
	public void removeOrder(Order order)
	{
		orders.remove(order);
	}
	
	public Order getOrder(int ID)
	{
		for(Order order : orders)
		{
			if(order.getID() == ID)
				return order;
		}
		
		return null;
	}

}
