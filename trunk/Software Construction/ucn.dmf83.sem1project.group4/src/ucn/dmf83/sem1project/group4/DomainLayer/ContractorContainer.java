package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;
import java.util.Iterator;

public class ContractorContainer {
	
private ArrayList<Contractor> contractors;
	
	private static ContractorContainer instance = null;

	protected ContractorContainer() {
		
	}

	public static ContractorContainer getInstance() {
		if (instance == null) {
			instance = new ContractorContainer();
		}
		return instance;
	}
	
	public void addContractor(Contractor contractor)
	{
		contractors.add(contractor);
	}
	
	public void removeContractor(Contractor contractor)
	{
		contractors.remove(contractor);
	}
	
	public Contractor getContractor(int ID)
	{
		for(Contractor ct : contractors)
		{
			if(ct.getID() == ID)
				return ct;
		}
		
		return null;
	}

}
