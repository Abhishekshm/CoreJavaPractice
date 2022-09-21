/*
Program: Inserting values in an array
@author: Abhishek Sharma
@date: 15th sept 2022
*/
import java.util.Scanner;  //importing Scanner class 

// declaring a class
class InsertionArray
{

   //method to update an element
   static void insert(int ar[], int num, int pos)
   {	  
         int size= ar.length;
		 int i;
	     int myArray[] = new int[size+1]; // intiializing an Array and giving size
		 
		// loop to enter the elements
		 for(i=0;i<pos-1;i++)
		 {
			 myArray[i]= ar[i];
		 }

		 myArray[pos-1]=num;

		 for(i=pos;i<size+1;i++)
		 {
			 myArray[i]= ar[i-1];
		 }

	    System.out.print("Array after insertion:" ); //printing statemet before output
		displayArray(myArray); //calling displayArray method
   }
   

	//declare static displayArray method
   static void displayArray(int ar[])
   {
	  for(int i:ar)  
	  {
		  System.out.print(i+ "  ");

	  }

   } // end of displayArray method

   //main method
  public static void main(String ...args)
  {
	Scanner sc= new Scanner(System.in); // creating a scanner class object
	System.out.println("Enter the size of the array"); //asking user to Enter the size
	int size= sc.nextInt();


	int arr[]= new int[size];// intiializing an Array and giving size

	// loop to enter the elements
	 System.out.println("Enter "+ size +" elements"); //Asking user to enter elements 
	for(int i=0;i<size;i++)
	{
	  arr[i]= sc.nextInt();// taking integer input
	}
     // end of for

	 System.out.println("----Elements before inserting value --------"); //printing statemet before output
	 displayArray(arr); //calling displayArray method

	 System.out.println(); // printing new line
	 System.out.println("----Elements the value to be inserted :"); //Asking user to enter the vlaue you want to Insert
	 int value= sc.nextInt();

	 System.out.println("----Elements the position at which it has to be inserted :"); //Asking user to enter the Position you want to Insert
	 int position= sc.nextInt();


    insert(arr,value,position); //calling insert method

  }

}