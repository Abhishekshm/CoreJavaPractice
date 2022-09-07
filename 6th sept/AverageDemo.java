/*
Program: Average of 3 subects
@author: Abhishek Sharma
@date: 6th sept 2022

*/

//declaring class
class AverageDemo
{
		//calling main method
	
	public static void main(String args[])
	{	
		float marks1= Float.parseFloat(args[0]);
		float marks2= Float.parseFloat(args[1]);
		float marks3= Float.parseFloat(args[2]);
		
		float averageMarks= (marks1+marks2+marks3)/3;
		
		System.out.println("The Average marks are: "+averageMarks);
	
	}
	// end of main
}
// end of class AverageDemo