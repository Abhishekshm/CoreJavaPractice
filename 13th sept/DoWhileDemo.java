/*
Program: Do While Loop
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class DoWhileDemo
{
	//declaring bulbStatus method
	static void bulbStatus(int status)
	{
		/*Do while Loop*/
			do //exit control Loop
			{
				System.out.println("Bulb is On"+ "......Durability : "+status);
				status-=5;
			}while(status>=10);  //end of Do While Loop
			
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
}//end of class DoWhileDemo