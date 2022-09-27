package p5;
/*-----------------------------------------------------
Part: 1
Written by: Belal Abu-Thuraia 40209178
COMP 249
ASSIGNMENT #1
March 4th 2022
-----------------------------------------------------
*/

import p4.UAV;

public class AgriculturalDrone extends UAV{
	//Class attributes
	protected String brand;
	protected int carry_cap;
	
	//Default constructor
	public AgriculturalDrone()
	{
		super();
		brand="Dealir Tech";
		carry_cap=25;
	}
	
	//Parameterized constructor
	public AgriculturalDrone(double weight, double price, String brand, int carry_cap)
	{
		super(weight, price);
		this.brand=brand;
		this.carry_cap=carry_cap;
	}
	
	//Copy constructor
	public AgriculturalDrone(AgriculturalDrone agri)
	{
		super(agri);
		this.brand=agri.brand;
		this.carry_cap=agri.carry_cap;
	}
	
	//Accessors
	public String getBrand()
	{
		return brand;
	}
	
	public int getCarry_cap()
	{
		return carry_cap;
	}
	
	//Mutators
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public void setCarry_cap(int carry_cap)
	{
		this.carry_cap=carry_cap;
	}

	//toString method
	@Override
	public String toString()
	{
		return "- This Agricultural Drone is manufactured by " + this.brand + " and has a carrying capacity of " + this.carry_cap+"kg. "
				+ "\nIt weighs " + getWeight() + " pounds and it costs " + getPrice()+"$.";
	}
	
	//equals method
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		if(this.getClass()!= obj.getClass())
		{
			return false;
		}
		
		final AgriculturalDrone other= (AgriculturalDrone) obj;
		
		return this.getWeight()==other.getWeight()&&this.getPrice()==other.getPrice()
				&&this.getBrand()==other.getBrand()&&this.getCarry_cap()==other.getCarry_cap();
	}
}
