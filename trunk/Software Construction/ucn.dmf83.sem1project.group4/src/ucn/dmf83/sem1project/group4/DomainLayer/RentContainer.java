package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;

public class RentContainer {
	
private ArrayList<Rent> rents;
	
	private static RentContainer instance = null;

	protected RentContainer() {
	}

	public static RentContainer getInstance() {
		if (instance == null) {
			instance = new RentContainer();
		}
		return instance;
	}
	
	public void addRent(Rent rent)
	{
		rents.add(rent);
	}
	
	public void removeRent(Rent rent)
	{
		rents.remove(rent);
	}
	
	public Rent getRent(int ID)
	{
		for(Rent r : rents)
		{
			if(r.getID() == ID)
				return r;
		}
		
		return null;
	}
	
}
