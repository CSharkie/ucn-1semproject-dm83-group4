package ucn.dmf83.sem1project.group4.ControlLayer;

import java.util.ArrayList;

import ucn.dmf83.sem1project.group4.DomainLayer.*;

public class ContractorControl {
	
	private ContractorContainer contractor;
	
	public ContractorControl()
	{
		contractor = ContractorContainer.getInstance();
	}
	
	public void createContractor(int ID, String name)
	{
		contractor.addContractor(ID, name);
	}
	
	public ArrayList<Contractor> getContractors(String name)
	{
		return contractor.getContractors(name);
	}
	
	public Contractor getContractor(int ID)
	{
		return contractor.getContractor(ID);
	}

}
