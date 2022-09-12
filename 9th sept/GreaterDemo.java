/*
Program: Find Largest Among two numbers
@author: Abhishek Sharma
@date: 9th sept 2022

*/
//  declaring class

class GreaterDemo
{
	//calling main method
	public static final void main(String args[])
	{
		
		int number1=Integer.parseInt(args[0]); //taking input and parsing
		int number2=Integer.parseInt(args[1]);
		
		//comparing two numbers
		if(number1 == number2)
		{
			
			System.out.println("Number "+ number1 +"  is eual to "+ number2);
			
		}
		//end if
		else if(number1>number2)
		{
			System.out.println("Number "+ number1 +"  is greater than to "+ number2);
		}
		//end else if
		
		else  //dangling else
		{
			System.out.println("Number "+ number2 +"  is greater than to "+ number1);
		}
	}
	//end of main
}//end of class GreaterDemo