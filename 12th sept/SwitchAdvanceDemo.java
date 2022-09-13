/*
Program: Print number of days according to the months
@author: Abhishek Sharma
@date: 12th sept 2022

*/
//  declaring class

class SwitchAdvanceDemo
{
	//calling main method
	public static final void main(String args[])
	{
		// Expression level Switch
		String game =args[0].toLowerCase();
		switch(game)
		{
			case "football" -> System.out.println("i love football");
			case "cricket" -> System.out.println("i love cricket");
			case "hockey" -> System.out.println("i love hockey");
			default -> System.out.println("i love nothing");
		} // end of Switch
	}
	//end of main
}//end of class SwitchAdvanceDemo