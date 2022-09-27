package driver;
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
import p2.Quadcopter;
import p3.Multirotor;
import p4.UAV;
import p5.AgriculturalDrone;
import p5.MAV;
public class Main {
	
	//Finding least and most expensive UAV method
	public static void findLeastAndMostExpensiveUAV(Object[] flyingObjects)
	{
		UAV minPriceUAV = null;
        double minPrice = Double.MAX_VALUE;
        UAV maxPriceUAV = null;
        double maxPrice = Double.MIN_VALUE;
        for(Object uav: flyingObjects) {
        	
        	if(uav instanceof UAV) {
        		
        	  if(uav!=null && ((UAV) uav).getPrice() < minPrice) {
                      minPrice = ((UAV) uav).getPrice();
                      minPriceUAV = (UAV) uav;
              }
              if(uav!=null && ((UAV) uav).getPrice() > maxPrice) {
                      maxPrice = ((UAV) uav).getPrice();
                      maxPriceUAV = (UAV) uav;
              }
        		
        	}
        }
            if(minPriceUAV!=null&&maxPriceUAV!=null)
            {
            	System.out.println("Most Expensive UAV: "+ maxPriceUAV.toString());
            	System.out.println();
            	System.out.println("Least Expensive UAV: " + minPriceUAV.toString());
            }
            else
            {
            	 System.out.println("There aren't any UAVs in the array!!");
            }
    
	}
	public static void main(String[] args) {
		
		//Creating instances from each class
		Airplane a1 = new Airplane("Bombardier",2389092.99,192);
		Airplane a2 = new Airplane();
		Helicopter h1 = new Helicopter("Bombardier", 449999.99, 100, 3, 2007, 10);
		Helicopter h2 = new Helicopter();
		Quadcopter q1= new Quadcopter();
		Quadcopter q2= new Quadcopter("Airbus", 204999.99, 71, 4, 2008, 10, 290);
		
		Multirotor mu1= new Multirotor();
		Multirotor mu2 = new Multirotor("HeliExpress", 299999.99, 73, 5, 2012, 9, 5);
		UAV u1=new UAV();
		UAV u2=new UAV(300.00, 74999.99);
		AgriculturalDrone ad1=new AgriculturalDrone();
		AgriculturalDrone ad2=new AgriculturalDrone(2500, 199999.99, "FarmerExpress", 29);
		MAV m1=new MAV();
		MAV m2=new MAV(280, 149999.99, "Malvic", 28);
		MAV m3=new MAV(280, 149999.99, "Malvic", 28);
		
		
		//Testing equals method
		System.out.println("----------------Equals method test----------------\n");
		boolean test1,test2;
		test1=h2.equals(q1);
		test2=m2.equals(m3);
		System.out.println("  Result from objects of different class: " + test1);
		System.out.println();
		System.out.println("  Result from identical objects: "+test2);
		System.out.println();
		System.out.println();
		
		//Creating an array of objects from each class
		Object[] flyingObjects= new Object[15];
		flyingObjects[0]=a1;
		flyingObjects[1]=a2;
		flyingObjects[2]=h1;
		flyingObjects[3]=h2;
		flyingObjects[4]=q1;
		flyingObjects[5]=q2;
		flyingObjects[6]=mu1;
		flyingObjects[7]=mu2;
		flyingObjects[8]=u1;
		flyingObjects[9]= u2;
		flyingObjects[10]=ad1;
		flyingObjects[11]=ad2;
		flyingObjects[12]=m1;
		flyingObjects[13]=m2;
		flyingObjects[14]=m3;
		for(Object obj:flyingObjects)
		{
			System.out.println(obj);
			System.out.println();
		}

		
		//Creating array from every nonUAV class
		Object [] noUAV = new Object[15];
		noUAV[0]=a1;
		noUAV[1]=a2;
		noUAV[2]=h1;
		noUAV[3]=h2;
		noUAV[4]=q1;
		noUAV[5]=q2;
		noUAV[6]=mu1;
		noUAV[7]=mu2;
		noUAV[8]= new Airplane();
		noUAV[9]=new Helicopter(h1);
		noUAV[10]=new Quadcopter("Airbus", 249999.99, 75, 5, 2018, 7, 270);
		noUAV[11]= new Helicopter();
		noUAV[12]=new Multirotor(mu1);
		noUAV[13]=new Multirotor("HeliExpress", 360099.99, 70, 6, 2014, 10, 4);
		noUAV[14]=new Airplane("Bombardier",2949100.99,195);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Calling method to find least and most expensive UAVs
		findLeastAndMostExpensiveUAV(flyingObjects);
		
		System.out.println();
		System.out.println();
		findLeastAndMostExpensiveUAV(noUAV);
		
		System.out.println();
		System.out.println();
		System.out.println("Thank you for using this program!!");
		

	}


}
