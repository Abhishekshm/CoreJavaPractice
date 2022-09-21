/*
Program: Deleting  values of an array
@author: Abhishek Sharma
@date: 15th sept 2022
*/
import java.util.Scanner; //importing Scanner class 

// declaring a class
class DeletingArray
{

    //static method delete
   static void delete(int ar[], int num)
   {
	   boolean found=false; //intiializing boolean variable 
	   int pos=-1;  //intiializing integer variable 

	  //for loop for finding the value
	   for(int i=0; i<ar.length;i++)
	   {
		   if(ar[i]==num) //condition for checking value
		   {
			   found=true;
			   pos=i;
			   break;
		   }
	   } //end of for

	   if(found) //if for delting value
	   {
		   for(int i=pos+1;i<ar.length;i++)
		   {
			   ar[i-1]=ar[i]; //deleting and updatig the value
		   }

		   System.out.println("----Elements after deleting the value "+ num + " are :"); //after Deleting the value 

			for(int i=0; i<ar.length-1;i++)
			{
				System.out.print(ar[i]+" "); //printing uodated array after deletion
			}
	   } // end of if 

	   else //single else statement
		   System.out.println("----Element not found------"); //printing element not found

   } // end of static delete method

	//declare static displayArray method
   static void displayArray(int ar[])
   {
	  for(int i:ar)  // int : data type of array 
	  {
		  System.out.print(i+ "  ");

	  }
   } // end of displayArray method

   //declaring main method
  public static void main(String ...args)
  {
	Scanner sc= new Scanner(System.in); // creating a scanner class object
	System.out.println("Enter the size of the array"); //asking user to Enter the size
	int size= sc.nextInt();


	int arr[]= new int[size];];// intiializing an Array and giving size

	// loop to enter the elements
	 System.out.println("Enter "+ size +" elements");
	 System.out.println("Enter 5 elements"); //Asking user to enter elements 
	 
	for(int i=0;i<size;i++) //loop for enter elements in array
	{ 
	  arr[i]= sc.nextInt();
	}
     // end of for loop

	 System.out.println("----Elements before deleting the value --------"); //printing statemet before output
	 displayArray(arr); //calling displayArray method

	 System.out.println(); // printing new line
	 System.out.println("----Elements the element to be deleted :");	//Asking user to enter the vlaue you want to delte
	 int value= sc.nextInt();

	 delete(arr,value);// calling delete method
  } // end of main

} // end of class DeletingArray