/*
Program: Implement Scanner class
@author: Abhishek Sharma
@date: 14th sept 2022

*/
//  declaring class
import java.util.Scanner;
class ScannerDemo
{
	static int rollNo;
	static String name;
	static float marks;
	static char gender;
	
	
	//declaring takeInput method
	static void takeInput()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Roll No : ");  //integr input
		rollNo = sc.nextInt();
		
		System.out.println("Enter Your Name : ");   //string input
		name = sc.next();
		
		System.out.println("Enter Your Marks : ");  //float input
		marks = sc.nextFloat();
		
		System.out.println("Enter Your Gender : ");  //character input
		gender = sc.next().charAt(0);
		
	} //  end of takeInput method
	
	//declaring display method
	static void display()
	{
		System.out.println();
		System.out.println();
		System.out.println("----------STUDENT DETAILS----------");
		System.out.println(" Roll No : "+rollNo);
		System.out.println(" Name : "+name);
		System.out.println(" Marks : "+marks);
		System.out.println(" Gender : "+gender);
	}//  end of display method
	
	//calling main method
	public static final void main(String args[])
	{
		takeInput(); // caling takeInput method
		display();  //calling display method
	}
	//end of main
}//end of class ScannerDemo