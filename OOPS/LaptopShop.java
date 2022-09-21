/*
Program: Make a class and an object
@author: Abhishek Sharma
@date: 19th sept 2022
*/
import java.util.Scanner;
// declaring LaptopShop class
class LaptopShop
{
   String brand;  		 //declaring String brand
   float screenSize;	//declaring float screenSize
   int model;			//declaring integer model
   double price;		//declaring double price
   String processor;	//declaring String processor
   String memory;		//declaring String memory
   
   //declaring insertLaptop method and passing values
   void insertLaptop(String brand, float screenSize,int model, double price, String processor,String memory)
   {
	   
	   //storing values using this keyword because of name clash
	   this.brand = brand; 
	   this.screenSize = screenSize;
	   this.model = model;
	   this.price = price;
	   
   } // end of insertLaptop method
   
   // declaring display method
   void display()
   {
	   System.out.println("Brand Name--- : "+brand); 		//printing Brand name
	   System.out.println("Screen Size--- : "+screenSize); //printing Screen Size
	   System.out.println("Model Number--- : "+model); 	//printing Model Number
	   System.out.println("Price--- : "+price); 		//printing Price
	   System.out.println("Processor--- : "+processor); //printing Processor
	   System.out.println("Memory--- : "+memory); 		//printing memory
	    
   }//  end of display method
   
}// end of class LaptopShop

class Laptop
{
	public static void main(String[] args)
	{
		LaptopShop laptop1 = new LaptopShop();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the brand name : "); //Asking user to enter the Brand name
		laptop1.brand = sc.next();
		
		System.out.println("Enter the Screen Size : "); //Asking user to enter the screen Size
		laptop1.screenSize = sc.nextFloat();
		
		System.out.println("Enter the Model Number : "); //Asking user to enter the Model Number
		laptop1.model = sc.nextInt();
		
		System.out.println("Enter the Price of the Laptop : "); //Asking user to enter the Price
		laptop1.price = sc.nextDouble();
		
		System.out.println("Enter the Processor of the Laptop : "); //Asking user to enter the Processor
		laptop1.processor = sc.next();
		
		System.out.println("Enter the Memory Of the laptop : "); //Asking user to enter the Memory
		laptop1.memory = sc.next();
		
		//calling insertLaptop method
		laptop1.insertLaptop(laptop1.brand,laptop1.screenSize,laptop1.model,laptop1.price,laptop1.processor,laptop1.memory);
		
		System.out.println(); //Printing new line
		System.out.println(); //Printing new line
		System.out.println("----------The given Details Are:---------");
		laptop1.display();
	}
}
   
   
