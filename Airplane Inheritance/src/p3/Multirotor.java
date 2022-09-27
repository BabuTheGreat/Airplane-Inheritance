package p3;
/*-----------------------------------------------------
Part: 1
Written by: Belal Abu-Thuraia 40209178
COMP 249
ASSIGNMENT #1
March 4th 2022
-----------------------------------------------------
*/

import p1.Airplane;
import p2.Helicopter;

public class Multirotor extends Helicopter {
	//Class attributes
	protected int numofrotors;
	
	//Default constructor
	public Multirotor () {
		super();
		numofrotors=4;
	}
	
	//Parameterized constructor
	public Multirotor(String brand, double price, int horsepower,int numofCylinders, int creationyear, int pass_cap, int numofrotors)
	{
		super(brand, price, horsepower, numofCylinders,creationyear,pass_cap);
		this.numofrotors=numofrotors;
	}
	
	//Copy constructor
	public Multirotor(Multirotor rotor)
	{
		super(rotor);
		this.numofrotors=rotor.numofrotors;
	}
	
	//Accessors
	public int getRotors()
	{
		return numofrotors;
	}
	
	//Mutators
	public void setRotors(int numofrotors)
	{
		this.numofrotors=numofrotors;
	}
	
	//toString method
	@Override
	public String toString() 
	{
		return "- This Multirotor has "+ this.numofrotors + " of rotors. (Brand: "+getBrand()+",  Price: "+getPrice()+
				"$,  HorsePower: " + getHorsepower()+ ",  Number of Cylinders: " + getCylinders()+",  Creation Year: " + getCreationyear()
				+ "\n  Passenger Capacity: " + getPass_cap()+")";
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
		final Multirotor other= (Multirotor) obj;
		return this.getBrand()==other.getBrand()&& this.getPrice()==other.getPrice()&&this.getHorsepower()==other.getHorsepower()
				&& this.getCylinders()==other.getCylinders()&& this.getCreationyear()==other.getCreationyear()&& this.getPass_cap()==other.getPass_cap()
				&& this.getRotors()==other.getRotors();
	}
	


}
