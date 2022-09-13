/*
Program: Checking Palindrome
5987 : not a palindrome
4444 : palindrome
6556 : palindrome
@author: Abhishek Sharma
@date: 13th sept 2022

*/
//  declaring class

class Palindrome
{
	//declaring checkingPalindrome method
	static void checkingPalindrome(int number)
	{
		int remainder=0;
		int reverseNumber = 0; //number used to store the reversed Number
		int temp = number; // original number is stored in temp variable
		
		while(number>0)
		{
			remainder =number%10;
			reverseNumber = (reverseNumber*10)+remainder;
			number = number/10;
		}
		
		if(temp == reverseNumber)
		{
			System.out.println("The Number is Palindrome Number");
		}
		else
		{
			System.out.println("The Number is not a Palindrome Number");
		}
		
	} //  end of checkingPalindrome method
	
	//calling main method
	public static final void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]); // taking input from the user and parsing
		checkingPalindrome(num1); // caling bublStatus method
	}
	//end of main
}//end of class Palindrome