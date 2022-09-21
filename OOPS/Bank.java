/*
Program: Bank Account
@author: Abhishek Sharma
@date: 19th sept 2022
*/
import java.util.Scanner; //importing Scanner class
//declare class BankDetails
class BankDetails
{
	//decalring Instance Variable
	String name;
	String password;
	int accountNo;
	
	//method for taking input
	void inputDetails(String name,int accountNo)
	{
		this.name=name;
		this.accountNo=accountNo;
		this.password=password;
	}
	
	//method for display output
	void display()
	{
		System.out.println("  Name of the Bank--"+name); //printing bank name
		System.out.println("  Account number--*****"+accountNo%10000); //printing last 4 digit of Account number
	}//end of display method
	
}//end of class BankDetails


// declaring class Bank
class Bank
{
	//declaring main method
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in); //creating Scanner class object
		
		BankDetails c1= new BankDetails();// craeting BankDetails object
		
		
		System.out.println("Enter the bank name : "); //Asking user to enter the Bank name
		c1.name=sc.next();
		System.out.println("Enter the Password : "); //Asking user to enter the password
		c1.password=sc.next();
		System.out.println("Enter the accountNo : "); //Asking user to enter the Account number
		c1.accountNo=sc.nextInt();
		
		System.out.println(); //Printing new line
		System.out.println(); //Printing new line
		System.out.println("----------The given Details Are:---------"); //Printing Statement before Ouptut
		c1.display(); //calling display method
	}// end of main
}//end of class Bank