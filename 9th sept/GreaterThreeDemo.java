/*
Program: Find Largest Among three numbers
@author: Abhishek Sharma
@date: 9th sept 2022

*/
//  declaring class

class GreaterThreeDemo
{
	//calling main method
	public static final void main(String args[])
	{
		
		int number1=Integer.parseInt(args[0]); //taking input and parsing
		int number2=Integer.parseInt(args[1]);
		int number3=Integer.parseInt(args[2]);
		
		//comparing two numbers
		if((number1 == number2) && (number1==number3))
		{
			System.out.println("All numbers are equal "); //All are equal
		}
			else if((number1>number2) && (number1>number3))
			{
				System.out.println("Number "+ number1 +"  is greatest. ");  //number1 is greatest
			}
			//end if
		
			else if(number2>number3)
			{
				System.out.println("Number "+ number2 +"  is greatest."); // number2 is greatest
			}
			//end else if
		
			else
			{
			System.out.println("Number "+ number3 +"  is greatest.");  // number3 is greatest
			}
	}
	//end of main
}//end of class GreaterThreeDemoDemo