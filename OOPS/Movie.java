/*
Program: Craeting class and object
@author: Abhishek Sharma
@date: 20th sept 2022
*/
import java.util.Scanner; //importing Scanner class
//declaring class Theaters
class Theaters
{
	//declaring Instance VAriable
	private String movieName;
	private String movieTime;
	private double ticketPrice;
	
	//Method for Inserting movie
	void insertMovie()
	{
		Scanner sc = new Scanner(System.in); //creating Scanner class Object
		
		System.out.println("---------Enter movie Details---------"); //Printig Statement before Output
		System.out.println("Enter the Movie name: "); //Asking user to Enter Movie Name
		this.movieName = sc.next();
		System.out.println("Enter the Movie time: "); //Asking user to Enter Movie Time
		this.movieTime = sc.next();
		System.out.println("Enter the Movie Ticket Price : "); //Asking user to Enter Movie Ticket Price
		this.ticketPrice = sc.nextDouble();
	}//end of Method insertMovie
	
	//declare display method 
	void display()
	{
		System.out.println("Movie Name : "+this.movieName+" Time : "+this.movieTime+" Ticket Price : "+this.ticketPrice );
	} //emd of display method
	
}//end of class Theaters

//decalring main class Movie
class Movie
{
	//decalring main method
	public static void main(String... args)
	{
		
		
		Theaters movie1 = new Theaters(); //creating movie1 object of class Theaters
		movie1.insertMovie(); //calling insertMovie method
		
		Theaters movie2 = new Theaters(); //creating movie2 object of class Theaters
		movie2.insertMovie(); //calling insertMovie method
		
		Theaters movie3 = new Theaters(); //creating movie3 object of class Theaters
		movie3.insertMovie(); //calling insertMovie method
		
		System.out.println("---------My Theater---------"); //Printig Statement before Output
		
		movie1.display(); //caliing display method
		movie2.display(); //caliing display method
		movie3.display(); //caliing display method
		
		
	} //end of main 
} //end of main class Movie
		