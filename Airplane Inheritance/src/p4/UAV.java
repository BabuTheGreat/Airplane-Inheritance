package p4;
/*-----------------------------------------------------
Part: 1
Written by: Belal Abu-Thuraia 40209178
COMP 249
ASSIGNMENT #1
March 4th 2022
-----------------------------------------------------
*/
public class UAV {
	//Class attributes
	protected double weight;
	protected double price;
	
	//Default constructor
	public UAV()
	{
		weight=25.0;
		price=98999.99;
		
	}
	//Parameterized constructor
	public UAV(double weight, double price)
	{
		this.weight=weight;
		this.price=price;
	}
	
	//Copy constructor
	public UAV(UAV uav)
	{
		this.weight=uav.weight;
		this.price=uav.price;
	}
	
	//Accessors
	public double getWeight()
	{
		return weight;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	//Mutators
	
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	//toString method
	@Override
	public String toString() 
	{
		return "- This UAV weighs " + getWeight()+"kg and it's valued at "+getPrice()+"$.";
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
		
		final UAV other= (UAV) obj;
		
		return this.getWeight()==other.getWeight()&&this.getPrice()==other.getPrice();
	}

}
