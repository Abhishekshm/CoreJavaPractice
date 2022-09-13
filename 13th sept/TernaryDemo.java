/*
Program: usage of Ternary Operator
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class TernaryDemo
{
	static void ternaryEvenOdd(int num)
	{
		String result = (num%2 == 0)?"Even Number" : "Odd Number";
		System.out.println(resuult);
	}
	
	//calling main method
	public static final void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		ternaryEvenOdd(number);
	}
	//end of main
}//end of class TernaryDemo