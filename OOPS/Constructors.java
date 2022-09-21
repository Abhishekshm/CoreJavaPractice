/*
Program: Creating Default and Parameterized constructor
@author: Abhishek Sharma
@date: 20th sept 2022
*/

//declare a class Constructors
class Constructors
{
	//declaring instance variable
	
	private int id;
	private String name;
	private float marks;
	private double per;
	private char grade;
	
	
	//Non-Parameterized Constructor
	Constructors()
	{
		System.out.println("-------------Non-Parameterized Constructor---------------");
		this.id = 101;
		this.name = "Abhishek";
		this.marks = 412f;
		this.per = 94;
		this.grade = 'a';
		
	}
	
	//Parameterized Constructor
	Constructors(int id,String name,float marks,double per,char grade)
	{
		System.out.println("-------------Parameterized Constructor---------------");
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.per = per;
		this.grade = grade;
		
	}
	Constructors()
	
	
	//declaring method for display constructor
	
	void display()
	{
		System.out.println("----------------------------");
		System.out.println("Id : "+id);  //printing id
		System.out.println("name : "+name);  //printing name
		System.out.println("marks : "+marks);  //printing marks
		System.out.println("grade : "+grade);  //printing grade
		System.out.println("Percentage : "+per); //printing per
		System.out.println("----------------------------");
		
	} // end of display method
	
	//declaring main method
	public static void main(String... args)
	{
		Constructors c1= new Constructors(); //creating a Constructors class object
		c1.display();  //calling display method
		Constructors c2= new Constructors(55,"Abhi",98f,55,'e');  //creating a Constructors class object and passing vlaue
		c2.display();  //calling display method
		
	}// end of main
}// end of class Constructors