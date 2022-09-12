/*
Program: Print Ascii value of a character
@author: Abhishek Sharma
@date: 12th sept 2022

*/
//  declaring class

class AsciiValue2
{
	// declaring method printAsciiValue
	static void printAsciiValue(char cValue)
	{
		int asciiValue = cValue; // computing ASCII value
		System.out.println("The ASCII value of " +cValue+ "is :" +asciiValue);
	}// end of method
	
	// declaring method checkChar
	static void checkChar(char cValue)
	{
		int  asciiValue = cValue;
		if((asciiValue>=65) && (asciiValue<=90)) //Checking uppercase
		{
			if((cValue=='A') ||(cValue=='E') ||(cValue=='I') ||(cValue=='O') ||(cValue=='U')) //checking vowel
			{
				System.out.println(" its a vowel");
			}
			else
			{
				System.out.println(" its a consonent");
			}
			System.out.println(" its a capital (UPPERCASE) leter");
		}
		else if((asciiValue>=97) && (asciiValue<=122)) //Checking lowercase
		{
			if((cValue=='a') ||(cValue=='e') ||(cValue=='i') ||(cValue=='o') ||(cValue=='u')) //checking consonenet
			{
				System.out.println(" its a vowel");
			}
			else
			{
				System.out.println(" its a consonent");
			}
			System.out.println(" its a small (LOWERCASE) leter");
		}
		else if((asciiValue>=48) && (asciiValue<=57))
		{
			System.out.println(" its a number");
		}
		else
		{
			System.out.println(" its a special number");
		}
	} // end of checkChar method
	
	
	//calling main method
	public static final void main(String args[])
	{
		char value = args[0].charAt(0); //taking a character input
		checkChar(value);
	}
	//end of main
}//end of class AsciiValue2