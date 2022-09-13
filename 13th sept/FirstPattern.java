/*
Program: First Pattern
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class FirstPattern
{
	static void computeFactorial(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.println("*");
		}
	}
	
	//calling main method
	public static final void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		computeFactorial(number);
	}
	//end of main
}//end of class FirstPattern