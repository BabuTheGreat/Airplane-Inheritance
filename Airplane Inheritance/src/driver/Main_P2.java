package driver;
/*-----------------------------------------------------
Part: 2
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

public class Main_P2 {
	
	
	//copy Array method


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
		MAV m3=new MAV(280, 149999.99, "Malvix", 28);
		
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
		
		//Displaying original array
		for(Object flyobj:flyingObjects)
		{
			System.out.println(flyobj);
		}
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------\n\n\n");
		System.out.println("Thank you for using this program!!");

	}

}
