/*
Program: Use of For Loop
@author: Abhishek Sharma
@date: 12th sept 2022

*/
//  declaring class

class ForLoopDemo
{
	/*Basic Programm of printing numbers */
	
	// declaring printNumbers
	static void printNumbers(int t)
	{
		int i;
		for (i=1;i<=t;i++)
		{
			System.out.println(i);
		}
	}// end printNumbers
	
	/*Table Programm using for loop*/ 
	
	//declaring printTable method
	static void printTable(int num)
	{
		System.out.println("table of "+num);
		for(int i=1;i<=10;i++)
		{
		System.out.println(num + "X "+ i+ " = "+ (num*i));
		}
	}// end printTable method
	//calling main method
	
	
	/*programm of Infinte Loop*/
	
	//declaring infinteLoop method
	static void infinteLoop(int j)
	{
		for(j=1;j<=10;j--)
		{
			System.out.println(j); // to stop this ifinite loop press CTRL+C
		}
	}//end of infinteLoop method
	
	
	
	
	public static final void main(String... args)
	{
		//int total = Integer.parseInt(args[0]);
		//printNumbers(total);
		
		//int num = Integer.parseInt(args[0]);
		//printTable(num);
		
		int num = Integer.parseInt(args[0]);
		infinteLoop(num);
	}
	//end of main
}//end of class ForLoopDemo