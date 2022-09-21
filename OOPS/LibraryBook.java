/*
Program: Inserting books In Library
@author: Abhishek Sharma
@date: 20th sept 2022
*/

//declare class Library
class Library
{
	//Attributes of class
	
	private String bookName;
	private String authorName;
	private int yearOfPublication;
	
	//declaring Non-parameterized constructor
	Library()
	{
		
	}
	
	//declaring parameterized constructor
	
	Library(String bookName,String authorName,int yearOfPublication)
	{
		System.out.println("-------Paramaterized Construtor-----------");
		//using this keyword storng details
		this.bookName = bookName;
		this.authorName = authorName;
		this.yearOfPublication = yearOfPublication;
	} // end of parameterized constructor
	
	
	//declare display method 
	void display()
	{
		System.out.println("(1.)Book Name : "+this.bookName+"----(2.) authorName : "+this.authorName+" ---(3.)Year of Publication : "+this.yearOfPublication ); //printing Output
	}
	
} //end of display method

//declare LibraryBook class
class LibraryBook
{
	//declareing main method
	public static void main(String... args)
	{
		Library book1 = new Library("Practise book","Abhishek",2000); //creating libraray object of class Library and passing value to constructor
		
		
		//book1.insertBook("Practise book","Abhishek",2000); //passing value Implicitly to insertBook
		
		Library book2 = new Library("Math book","Rohan",2022); //creating libraray object of class Library and passing value to constructor
		
		
		//book2.insertBook("Math book","Rohan",2022); //passing value explicitly to insertBook
		
		Library book3 = new Library("Atlas","Vasko",2011); //creating libraray object of class Library and passing value to constructor
		
		
		//book3.insertBook("Atlas","Vasko",2011); //passing value explicitly to insertBook
		
		System.out.println(); // printing new line
		System.out.println(); // printing new line
		System.out.println("-----------The Books Are : ------------"); //printing Statement before output
		book1.display(); //caliing display method
		book2.display(); //caliing display method
		book3.display(); //caliing display method
		
	} //end of main 
}// end of main class LibraryBook