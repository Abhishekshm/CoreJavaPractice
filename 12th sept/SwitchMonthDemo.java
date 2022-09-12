/*
Program: Print number of days according to the months
@author: Abhishek Sharma
@date: 12th sept 2022

*/
//  declaring class

class SwitchMonthDemo
{
	//calling main method
	public static final void main(String args[])
	{
		int month = Integer.parseInt(args[0]);
		switch(month)
		{
			case 1 : 
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 : 	 
			case 10 : 		 
			case 12 : 	System.out.println("Number of days are : 31");
						break;
			case 2 :  System.out.println("Number of days are : 28");
						break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :  System.out.println("Number of days are : 30");
						break;
			default : 			System.out.println("Wrong Input");	 
							
		} // end of Switch
	}
	//end of main
}//end of class SwitchMonthDemo
