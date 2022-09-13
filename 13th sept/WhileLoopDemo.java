/*
Program: While Loop
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class WhileLoopDemo
{
	//declaring bulbStatus method
	static void bulbStatus(int status)
	{
		/*While Loop */
			while(status>=10)
			{
				System.out.println("Bulb is On"+ "......Durability : "+status);
				status-=5;
			} // end of While Loop
			if(status<10)
		
				System.out.println("Bulb is Off");
		
	} //  end of bulbStatus method
	
	//calling main method
	public static final void main(String args[])
	{
		int durability = Integer.parseInt(args[0]); // taking input from the user and parsing
		bulbStatus(durability); // caling bublStatus method
	}
	//end of main
}//end of class WhileLoopDemo