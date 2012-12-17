package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;

public class CustomerContainer {

private ArrayList<Customer> customers;
private ArrayList<customerGroup> customerGroups;
	
	private static CustomerContainer instance = null;
	
	protected CustomerContainer(){
		
	}
	
	public CustomerContainer getInstance()
	{
		if(instance == null) {
	         instance = new CustomerContainer();
	      }
	      return instance;
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	public void removeCustomer(Customer customer)
	{
		customers.remove(customer);
	}
	
	public Customer getCustomer(int ID)
	{
		for(Customer c : customers)
		{
			if(c.getID() == ID)
			{
				return c;
			}
		}
		
		return null;
	}
	
	public ArrayList<Customer> getCustomers(String partialName) {
		ArrayList<Customer> clist = new ArrayList<Customer>();
		for(Customer c : customers) {
			if(c.getName().contains(partialName)) 
				clist.add(c);
		}
		
		return clist;
	}
	
	public void addCustomerGroup(customerGroup cgroup)
	{
		customerGroups.add(cgroup);
	}
	
	public void removeCustomerGroup(customerGroup cgroup)
	{
		customerGroups.remove(cgroup);
	}
	
	public customerGroup getCustomerGroup(int ID)
	{
		for(customerGroup cg : customerGroups)
		{
			if(cg.getID() == ID)
				return cg;
		}
		
		return null;
	}
	
	public void addCustomer(String name, int ID, customerGroup cgroup) {
		Customer c = new Customer(name,ID);
		c.setGroup(cgroup);
		addCustomer(c);
	}

	
	public void updateCustomer(Customer original, Customer newc) {
		customers.remove(original);
		customers.add(newc);
	}
}
