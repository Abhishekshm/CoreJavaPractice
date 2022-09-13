/*
Program: Break and Continue
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class BreakContinueDemo
{
	 static void printNumber() 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
	}
	
	static void printNumber1()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
	
	static void printNumber2() //unlabelled Break and continue
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println();
			for(int j=1;j<=3;j++)
			{
				if(i==j)
				continue;
			System.out.print(" "+i+""+j+ "   ");
			}
		}
	} 
	
	static void printNumber3() //labelled Break and continue
	{
		outerLoop : for(int i=1;i<=3;i++)
		{
			System.out.println();
			for(int j=1;j<=3;j++)
			{
				if(i==j)
				continue outerLoop;
			System.out.print(i+""+j+ "   ");
			}
		}
	}
	
	//calling main method
	public static final void main(String args[])
	{
		System.out.println("-------Break for loop---------");
		printNumber();
		System.out.println("-------Continue for loop---------");
		printNumber1();
		System.out.println("-------unlabelled Break and continue---------");
		printNumber2();
		printNumber3();
		System.out.println("-- -----labelled Break and continue---------");
	}
	//end of main
}//end of class BreakContinueDemo