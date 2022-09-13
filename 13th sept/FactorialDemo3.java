/*
Program: 3rd pattern
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class FactorialDemo3
{
	//declaring pattern method
	static void pattern(int numOfRows)
	{
		for(int i =1 ; i<=numOfRows ; i++)   //Nested loop
		{
			for(int j =1 ; j<=(numOfRows-i+1) ; j++)
			{
				System.out.print("*"); //printing "*"
			}
			System.out.println(); //printing new line
		} // end of Nested loop
		
	} //  end of pattern method
	
	//calling main method
	public static final void main(String args[])
	{
		int number = Integer.parseInt(args[0]); // taking input from the user and parsing
		pattern(number); // caling pattern method
	}
	//end of main
}//end of class FactorialDemo3