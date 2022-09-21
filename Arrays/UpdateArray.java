/*
Program: Updating Elements  in an array
@author: Abhishek Sharma
@date: 15th sept 2022
*/
import java.util.Scanner;

// declaring a class
class UpdateArray
{
    
   //method to update an element
   static void update(int ar[], int oldValue, int newValue)
   {	  
	   boolean found=false;
	   int pos=-1;
	   
	   // searching the value in the loop
	   for(int i=0; i<ar.length;i++)
	   {
		   if(ar[i]==oldValue)
		   {
			   found=true;
			   pos=i;
			   break;
		   }
	   }
	   
	   if(found)
	   {
		   ar[pos]=newValue;
		   System.out.println("----Elements after Updating the value --------");
	      displayArray(ar);
	     
	   }
	   
	   else
		   System.out.println("----Elements not found --------"); 
	   
   }
  
   static void displayArray(int ar[])
   {
	  for(int i:ar)  // int : data type of array 
	  {
		  System.out.print(i+ "  ");
		  
	  }
    
	   
   }
   
 
   
     
   //main method
  public static void main(String ...args)
  {
	Scanner sc= new Scanner(System.in); // Scanner object for input of elements
	System.out.println("Enter the size of the array");
	int size= sc.nextInt();
	
	
	int arr[]= new int[size];// creating an array
	
	// loop to enter the elements
	 System.out.println("Enter "+ size +" elements");
	for(int i=0;i<size;i++)
	{
	  arr[i]= sc.nextInt();// taking integer input
	}
     // end of for
	 
	 System.out.println("----Elements before Updating the value --------");
	 displayArray(arr);
     
	 System.out.println();
	 System.out.println("----Elements the value to be updated :");
	 int value= sc.nextInt();
	 
	  System.out.println("----Elements the new value :");
	 int nValue= sc.nextInt();
	 
	 
	update(arr,value,nValue);// calling delete method
	 
	 
	 
    
  }
  
}