/*
Program: If Else Demo
@author: Abhishek Sharma
@date: 9th sept 2022

*/
//  declaring class

class IfElseDemo
{
	//calling main method
	public static final void main(String args[])
	{
		
		int age=Integer.parseInt(args[0]); //taking input and parsing
		
		//checking the age
		if(age>=18)
		{
			
			System.out.println("You can Vote");
			
		}
		//end if
		else
		{
			System.out.println("Too young");
		}
		//end else
	}
	//end of main
}//end of class IfElseDemo

