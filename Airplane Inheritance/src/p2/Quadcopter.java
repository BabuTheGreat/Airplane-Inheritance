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
import p3.Multirotor;

public class Quadcopter extends Helicopter {
	//Class attributes
	protected int maxspeed;
	
	//Default constructor
	public Quadcopter() {
		super();
		maxspeed= 250;
	}
	
	//Parameterized constructor
	public Quadcopter(String brand, double price, int horsepower,int numofCylinders, int creationyear, int pass_cap, int maxspeed)
	{
		super(brand, price, horsepower, numofCylinders,creationyear,pass_cap);
		this.maxspeed=maxspeed;
	}
	
	//Copy constructor
	public Quadcopter(Quadcopter quad)
	{
		super(quad);
		this.maxspeed=quad.maxspeed;
	}
	
	//Accessors
	public int getMaxspeed()
	{
		return maxspeed;
	}
	
	//Mutators
	public void setMaxspeed(int maxspeed)
	{
		this.maxspeed=maxspeed;
	}
	
	//toString method
	@Override
	public String toString() 
	{
		return "- This Quadcopter has a maxspeed of "+ this.maxspeed+"mph. (Brand: "+getBrand()+",  Price: "+getPrice()+
				"$,  HorsePower: " + getHorsepower()+ ",  Number of Cylinders: " + getCylinders()+",  Creation Year: " + getCreationyear()
				+ "\n  Passenger Capacity: " + getPass_cap()+")" ;
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
		final Quadcopter other= (Quadcopter) obj;
		return this.getBrand()==other.getBrand()&& this.getPrice()==other.getPrice()&&this.getHorsepower()==other.getHorsepower()
				&& this.getCylinders()==other.getCylinders()&& this.getCreationyear()==other.getCreationyear()
				&& this.getPass_cap()==other.getPass_cap() && this.getMaxspeed()==other.getMaxspeed();
	}
	

}
