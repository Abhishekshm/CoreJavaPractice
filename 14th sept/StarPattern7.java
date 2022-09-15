/*
Program: 5th pattern
@author: Abhishek Sharma
@date: 14th sept 2022
    *
   * *
 * * * *
*/
//  declaring class

class StarPattern7
{
	//declaring pattern method
	static void pattern(int numOfRows)
	{
		for(int i =1 ; i<=numOfRows ; i++)   //Nested loop
		{
			System.out.println(); //print new line
			for(int spaces =numOfRows ; spaces>=i ; spaces--)
			{
				System.out.print(" "); //printing "   "
			}
			for(int j=1; j<=i;j++)
			{
			System.out.print("* "); //printing "*"
			}
		} // end of Nested loop
		
	} //  end of pattern method
	
	//calling main method
	public static final void main(String args[])
	{
		int number = Integer.parseInt(args[0]); // taking input from the user and parsing
		pattern(number); // caling pattern method
	}
	//end of main
}//end of class StarPattern7