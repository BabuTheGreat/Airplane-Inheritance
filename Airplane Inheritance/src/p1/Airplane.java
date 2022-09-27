package p1;
/*-----------------------------------------------------
  Part: 1
  Written by: Belal Abu-Thuraia 40209178
  COMP 249
  ASSIGNMENT #1
  March 4th 2022
-----------------------------------------------------
*/

public class Airplane {
	/*
	 * Class Attributes
	 */
	protected String brand;
	protected double price;
	protected int horsepower;
	//default constructor
	public Airplane()
	{
		brand="Airbus";
		price=200000.00;
		horsepower=30;
	}
	
	/*Parameterized constructor 
	 */
	public Airplane (String brand, double price, int horsepower)
	{
		this.brand= brand;
		this.price=price;
		this.horsepower=horsepower;
	}
	
	//copy constructor
	public Airplane(Airplane air)
	{
		this.brand=air.brand;
		this.price=air.price;
		this.horsepower=air.horsepower;
	}
	
	//Accessors 
	public String getBrand()
	{
		return brand;
	}
	public double getPrice()
	{
		return price;
	}
	
	public int getHorsepower()
	{
		return horsepower;
	}
	
	//Mutators
	public void setBrand(String brand) 
	{
		this.brand=brand;
		
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setHorsepower(int horsepower)
	{
		this.horsepower=horsepower;
	}
	
	//toString method
	@Override
	public String toString()
	{
		return "- This Airplane is made by " + this.brand + ". It costs "+this.price + "$ and its horse power is "+this.horsepower+".";
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
		
		final Airplane other= (Airplane) obj;
		
		return this.getBrand()==other.getBrand()&&this.getPrice()==other.getPrice()&&this.getHorsepower()==other.getHorsepower();
	}
	
	
}









