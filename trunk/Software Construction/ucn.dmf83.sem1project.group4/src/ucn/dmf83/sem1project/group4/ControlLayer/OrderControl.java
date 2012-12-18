package ucn.dmf83.sem1project.group4.ControlLayer;

import java.util.ArrayList;
import java.util.Date;

import ucn.dmf83.sem1project.group4.DomainLayer.*;

public class OrderControl {
	
	private OrderContainer orderContainer;
	private Order order;
	private Product product;
	
	private static OrderControl instance;
	
	public OrderControl()
	{
		orderContainer = OrderContainer.getInstance();
	}
	
	public static OrderControl getInstance() {
		if (instance == null) {
			instance = new OrderControl();
		}
		return instance;
	}
	
	public Order createOrder(int iD, Customer customer, Employee seller, Date orderDate, boolean isPaid)
    {
        order = new Order(iD, customer, seller, orderDate, isPaid);
        orderContainer.addOrder(order);
        return order;
    }
	
	public Order getOrder(int ID)
    {
        return orderContainer.getOrder(ID);
    }
	
	public ArrayList<Order> getOrders(Date startDate, Date endDate)
	{
		return orderContainer.getOrders(startDate, endDate);
	}
	
	public ArrayList<Order> getOrders(Employee emp)
	{
		return orderContainer.getOrders(emp);
	}
	
	public ArrayList<Order> getOrders(Date startDate)
	{
		return orderContainer.getOrders(startDate, new Date());
	}
	
	public double makePayment(Order o, double amount)
    {
        return amount - o.getFinalPrice();
    }
	
	public void removeOrder(Order order)
	{
		orderContainer.removeOrder(order);
	}

}
