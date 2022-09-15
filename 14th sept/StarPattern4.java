/*
Program: 4th pattern
@author: Abhishek Sharma
@date: 14th sept 2022

*/
//  declaring class

class StarPattern4
{
	//declaring pattern method
	static void pattern(int numOfRows)
	{
		for(int i =1 ; i<=numOfRows ; i++)   //Nested loop
		{
			for(int j =numOfRows ; j>=i ; j--)
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
}//end of class StarPattern4