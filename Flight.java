package classes;

public class Flight 
{
	private String modelAvion;
	private Plane plane;
	private Airport arrival;
	private Airport departure;
	private String company;
	private String id;
	
	public Flight(String id, Airport a1, Airport a2, String company, String model) 
	{
		this.id = id;
		this.departure = a1;
		this.arrival = a2;
		this.company = company;
		this.modelAvion=model;
	}

	@Override
	public String toString()
	{
		String str = "";
		
		str+= "vol numéro "+id+" au bord d'un " + modelAvion +" appartenant a la compagnie "+company+" qui va de : "+ departure.getShortName() +" à "+arrival.getShortName(); 
		return str;
	}

	/**
	 * @return the arrival
	 */
	public Airport getArrival() 
	{
		return arrival;
	}

	/**
	 * @return the departure
	 */
	public Airport getDeparture() 
	{
		return departure;
	}

	/**
	 * @param plane the plane to set
	 */
	public void setPlane(Plane plane) 
	{
		this.plane = plane;
	}
	
	

	

}
