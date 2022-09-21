/*
Program: Negative values of an array
@author: Abhishek Sharma
@date: 15th sept 2022
*/
import java.util.Scanner; //importing Scanner class 

// declaring a class
class NegativeValuesArray
{
    //static inputArray method
   static void inputArray()
   {
    Scanner sc= new Scanner(System.in); // creating a scanner class object
	int arr[]= new int[5];// intiializing an Array and giving size

	
	 System.out.println("Enter 5 elements"); //Asking user to enter elements 
	for(int i=0;i<5;i++) //loop for enter elements in array
	{ 
	  arr[i]= sc.nextInt();
	}
    // end of for loop
	 System.out.println("-------Negative Values in Array are :----------"); //printing statment before Output
   displayEnhancedFor(arr); // calling displayEnhancedFor method
   }
   // end of inputArray method

	//static displayEnhancedFor method
   static void displayEnhancedFor(int ar[])
   {
	  for(int i:ar) 
	  {
		  if(i<0) //condition for printing Negative values
		  System.out.print(i+ "  ");

	  }


   } // end of method displayEnhancedFor




   //declaring main method
  public static void main(String ...args)
  {
	  // calling method inputArray
   inputArray();


  }//end of main

}// end of class NegativeValuesArray