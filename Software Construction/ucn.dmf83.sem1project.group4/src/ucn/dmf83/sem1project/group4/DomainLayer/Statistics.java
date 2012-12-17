package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;
import java.util.Date;

public class Statistics {

	public void printEmployeeStatistics(Employee employee, Date startDate, Date endDate)
	{
		ArrayList<Order> orders = OrderContainer.getInstance().getOrders(startDate, endDate);
		ArrayList<Order> usedOrders = new ArrayList<Order>();
		for(Order order : orders)
		{
			if(order.getSeller() == employee)
			{
				usedOrders.add(order);
			}
		}
		
		
		// TODO: add things to do with usedOrders. That is the list want contains our target area
	}
	
	public void printCustomerStatistics(Customer customer, Date startDate, Date endDate)
	{
		ArrayList<Order> orders = OrderContainer.getInstance().getOrders(startDate, endDate);
		ArrayList<Order> usedOrders = new ArrayList<Order>();
		for(Order order : orders)
		{
			if(order.getCustomer() == customer)
			{
				usedOrders.add(order);
			}
		}
		
		// TODO: add things to do with usedOrders. That is the list want contains our target area
	}
	
	public void printGenericStatistics(Date startDate, Date endDate)
	{
		ArrayList<Order> usedOrders = OrderContainer.getInstance().getOrders(startDate, endDate);
		
		
		// TODO: add things to do with usedOrders. That is the list want contains our target area
	}

}
