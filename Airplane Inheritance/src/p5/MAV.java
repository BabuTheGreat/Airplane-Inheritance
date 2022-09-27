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

public class MAV extends UAV{
	//Class attributes
	protected String model;
	protected double size;
	
	//Default constructor
	public MAV() {
		super();
		model="Malvic";
		size=20;
	}
	
	//Parameterized constructor
	public MAV(double weight, double price, String model, double size)
	{
		super(weight, price);
		this.model=model;
		this.size=size;
	}
	
	//Copy constructor
	public MAV(MAV mav)
	{
		super (mav);
		this.model=mav.model;
		this.size=mav.size;
	}
	
	//Accessors
	public String getModel()
	{
		return model;
	}
	
	public double getSize()
	{
		return size;
	}
	
	//Mutators
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public void setSize(double size)
	{
		this.size=size;
	}
	
	
	//toString method
	@Override
	public String toString()
	{
		return "- This MAV is a " + this.model +" model and its size is " +this.size+"cm. It weighs " + getWeight()+" pounds and it costs "
				+ getPrice()+"$.";
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
		
		final MAV other= (MAV) obj;
		
		return this.getWeight()==other.getWeight()&&this.getPrice()==other.getPrice()
				&&this.getModel()==other.getModel()&&this.getSize()==other.getSize();
	}

}
