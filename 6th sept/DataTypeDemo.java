/*
Program: Understanding data types in java
@author: Abhishek Sharma
@date: 6th sept 2022

*/

//declaring class
class DataTypeDemo
{
		//calling main method
		static int number;
	public static void main(String args[])
	{	
		
		int number =44;
		short value= (short) -32770; //typecasting
		float marks= 56.6f;
		double percentage= 87.123; 
		char grade= 'A';
		long hugeNumber= 989895609584l;
		boolean status= true;
		byte b= (byte) 129; //typecasting
		String  firstName= "Abhishek" //  string is a class from java.lang.string
		
		System.out.println("The value of int is: "+number); 			  //Printing Integer value
		System.out.println("The value of number is: "+value);			 //Printing short value
		System.out.println("The value of marks is: "+marks);			 //Printing float value
		System.out.println("The value of percentage is: "+percentage);  //Printing double value
		System.out.println("The value of grade is: "+grade); 			//Printing character value
		System.out.println("The value of hugeNumber is: "+hugeNumber); //Printing long value
		System.out.println("The value of status is: "+status);		 //Printing boolean value
		System.out.println("The value of b is: "+b);				//Printing byte value
		System.out.println("The value of String is: "+firstName); //Printing string value
		
	}
	//end of main
}//end of class DataTypeDemo