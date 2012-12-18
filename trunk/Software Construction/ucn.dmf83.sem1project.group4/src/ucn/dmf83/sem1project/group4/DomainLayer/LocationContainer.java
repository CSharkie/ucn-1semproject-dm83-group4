package ucn.dmf83.sem1project.group4.DomainLayer;

import java.util.ArrayList;
import java.util.Iterator;

public class LocationContainer {
	
	private ArrayList<Location> locations;
	
	private static LocationContainer instance = null;

	protected LocationContainer() {
	}

	public static LocationContainer getInstance() {
		if (null == instance) {
			instance = new LocationContainer();
		}
		return instance;
	}
	
	public void addLocation(Location loc)
	{
		locations.add(loc);
	}
	
	public void removeLocation(Location loc)
	{
		locations.remove(loc);
	}
	
	public Location getLocation(int ID)
	{
		for(Iterator<Location> i = locations.iterator(); i.hasNext();)
		{
			Location ct = i.next();
			if(ct.getID() == ID)
				return ct;
		}
		
		return null;
	}
	
	public Location getLocation(String name)
	{
		for(Iterator<Location> i = locations.iterator(); i.hasNext();)
		{
			Location loc = i.next();
			if(loc.getName() == name)
				return loc;
		}
		
		return null;
	}
	
	public Location getLocation(Product p)
	{
		for(Location loc : locations)
		{
			if(loc.hasProduct(p))
				return loc;
		}
		
		return null;
	}

}
