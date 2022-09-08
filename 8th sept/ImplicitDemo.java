/*
Program: Implicit Cast
@author: Abhishek Sharma
@date: 8th sept 2022

*/

//declaring class
class ImplicitDemo
{
	//calling main method
	public static void main(String args[])
	{
		byte b= 8;
		// b=b+8; "Error Typecasting"
		b+=6; //implicit cast
		System.out.println("The value of b is : "+b); 
	}
	//end of main
}//end of class ImplicitDemo
