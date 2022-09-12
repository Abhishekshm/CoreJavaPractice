/*
Program: Printing the day on the basis of value
@author: Abhishek Sharma
@date: 9th sept 2022

*/
//  declaring class

class SwitchDemo2
{
	//calling main method
	public static final void main(String args[])
	{
		char grade= 'A';
		switch(grade)
		{
			case 'A' : System.out.println("Excellent");
		             break;
			case 'B' : System.out.println("Average");
		             break;
			case 'C' : System.out.println("Passed");
		             break;
			case 'D' : System.out.println("Fail");
		             break;
			case 'E' : System.out.println("Work Hard");
		             break;		 
					 
			case 'F' : System.out.println("you have no brain");
		             break;		 
			case 'G' : System.out.println("Gain Knowledge");
		             break;	 
			default : 	System.out.println("Wrong Input");	 
		} // end of Switch
	}
	//end of main
}//end of class SwitchDemo2
