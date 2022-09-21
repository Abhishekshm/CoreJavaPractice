/*
Program: Make a class and an object
@author: Abhishek Sharma
@date: 19th sept 2022
*/
import java.util.*; //importing Scanner class
class Student
{
	//decalring Instance Variable
	 String name;
	 int id;
	private String password;
	
	//method for craeting password
	 void createPassword()
	{
		this. password = name+"123";
	}
	//method for taking input
	void creatStudent()
	{
		Scanner sc = new Scanner(System.in); //creating Scanner class object
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter ID: ");
		id = sc.nextInt();
	}
	
	
	//method for display output
	void display()
	{
		createPassword(); //calling method for creating password
		System.out.println("name: " + name);
		System.out.println("Id : " + id);
		System.out.println("Password : " + password);
	}
}
class LmsCreation
{
	public static void main (String args[])
	{
		Student s=new Student(); //crreating Student class Object
		s.creatStudent(); //calling creatStudent
		s.display(); //calling display
	} 
}