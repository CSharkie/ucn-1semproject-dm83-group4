package ucn.dmf83.sem1project.group4.ControlLayer;

import java.util.Date;

import ucn.dmf83.sem1project.group4.DomainLayer.*;

public class OrderControl {
	
	private OrderContainer orderContainer;
	private Order order;
	
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
	
	public Order getOrder()
    {
        return order;
    }
	
	public double makePayment(double amount)
    {
        return amount - order.getFinalPrice();
    }

}
