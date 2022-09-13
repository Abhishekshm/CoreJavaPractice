/*
Program: Factorial Of number
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class FactorialDemo
{
	static void computeFactorial(int num)
	{
		long result = 1L;
		for(int i=num ;i>=1; i--)
		{
			 result*=i;
		}
		System.out.println("The Factorial of the number "+num +" is "+ result);
	}
	
	//calling main method
	public static final void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		computeFactorial(number);
	}
	//end of main
}//end of class FactorialDemo