/*
Program: Print number of days according to the months
@author: Abhishek Sharma
@date: 12th sept 2022

*/
//  declaring class

class NestedSwitch
{
	//calling main method
	public static final void main(String args[])
	{
		
		String game =args[0].toLowerCase();
		String role =args[0].toLowerCase();
		switch(game)
		{
			case "football" : System.out.println("i love football");
								switch(role)
								{
									case "keeper" : System.out.println("i am golkeeper");
													break;
									case "striker" :System.out.println("i love striker");
													break;
									default : System.out.println("i am alrounder");
								}
								break;
			case "cricket" : System.out.println("i love cricket");
							 break;
			case "hockey" : System.out.println("i love hockey");
							break;
			default : System.out.println("i love nothing");
		} // end of Switch
	}
	//end of main
}//end of class NestedSwitch