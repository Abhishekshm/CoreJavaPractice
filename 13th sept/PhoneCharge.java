/*
Program: Phone charging Demo
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class PhoneCharge
{
	static void startCharging(int batteryLife)
	{
		while(batteryLife<100)
		{
			System.out.println("-------CHARGING-------"+batteryLife);
			batteryLife+=15;
			if(batteryLife>=100)
				break;
		}
		if(batteryLife>=100)
			System.out.println("------The battery is fully charged(100%)-----");
	}
	
	//calling main method
	public static final void main(String args[])
	{
		int battery = Integer.parseInt(args[0]);
		startCharging(battery);
	}
	//end of main
}//end of class PhoneCharge