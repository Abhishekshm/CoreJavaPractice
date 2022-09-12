/*
Program: Printing the day on the basis of value
@author: Abhishek Sharma
@date: 9th sept 2022

*/
//  declaring class

class SwitchDemo
{
	//calling main method
	public static final void main(String args[])
	{
		int number= 67;
		switch(number)
		{
			case 1 : System.out.println("Monday");
		             break;
			case 2 : System.out.println("Tuesday");
		             break;
			case 3 : System.out.println("Wednesday");
		             break;
			case 4 : System.out.println("Thursday");
		             break;
			case 5 : System.out.println("Friday");
		             break;		 
					 
			case 6 : System.out.println("Saturday");
		             break;		 
			case 7 : System.out.println("Sunday");
		             break;	 
			default : 	System.out.println("Wrong Input");	 
		} // end of Switch
	}
	//end of main
}//end of class SwitchDemo
