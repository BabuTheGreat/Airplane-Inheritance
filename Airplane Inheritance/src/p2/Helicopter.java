package p2;
/*-----------------------------------------------------
Part: 1
Written by: Belal Abu-Thuraia 40209178
COMP 249
ASSIGNMENT #1
March 4th 2022
-----------------------------------------------------
*/
import p1.Airplane;

public class Helicopter extends Airplane {
	
	//Class attributes
	protected int numofCylinders;
	protected int creationyear;
	protected int pass_cap;
	
	//Default constructor
	public Helicopter () {
		super();
		numofCylinders=4;
		creationyear=2009;
		pass_cap=10;
	}
	
	//Parameterized constructor 
	public Helicopter(String brand, double price, int horsepower,int numofCylinders, int creationyear, int pass_cap)
	{
		super(brand, price, horsepower);
		this.numofCylinders=numofCylinders;
		this.creationyear=creationyear;
		this.pass_cap=pass_cap;
	}
	
	//Copy Constructor
	public Helicopter(Helicopter heli)
	{
		super(heli);
		this.numofCylinders=heli.numofCylinders;
		this.creationyear=heli.creationyear;
		this.pass_cap=heli.pass_cap;
	}
	
	//Accessors
	public int getCylinders()
	{
		return numofCylinders;
	}
	
	public int getCreationyear()
	{
		return creationyear;
	}

	public int getPass_cap()
	{
		return pass_cap;
	}
	
	//Mutators
	public void setCylinders(int numofCylinders)
	{
		this.numofCylinders=numofCylinders;
	}
	
	public void setCreationyear(int creationyear)
	{
		this.creationyear=creationyear;
	}
	
	public void setPass_cap(int pass_cap)
	{
		this.pass_cap=pass_cap;
	}
	
	//toString method
	@Override
	public String toString()
	{
		return "- This Helicopter created in " + this.creationyear + ". It has " + this.numofCylinders + 
				" of cylinders and it has a passenger capacity of " + this.pass_cap +".";
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
		
		final Helicopter other= (Helicopter) obj;
		
		return this.getBrand()==other.getBrand()&& this.getPrice()==other.getPrice()&&this.getHorsepower()==other.getHorsepower()
				&& this.getCylinders()==other.getCylinders()&& this.getCreationyear()==other.getCreationyear()&& this.getPass_cap()==other.getPass_cap();	
	}
}








