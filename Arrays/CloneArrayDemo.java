/*
Program: craeting a clone Array
@author: Abhishek Sharma
@date: 16th sept 2022
*/
// declaring class
class CloneArrayDemo
{
   
   // method to craete Copy Array
   
   static void copyArray(int originalArray[])
   {
	   //declaring an array to create a clone
	   
	   int cloneArray[] = originalArray.clone(); // Creating deep copy
	   
	   //declaring an array to create copy
	   int copyArr[] =originalArray;   // Creating Shallow copy
	   
	   System.out.println("Printing the values of original array" );
	   
           displayArray(originalArray);	   
		   
		   //changing the values of original array
		   for(int i=0;i<originalArray.length;i++)
		   {
			   originalArray[i]+=2; //adding values to Original Array
		   }
		   
		   //after change 
		    System.out.println(); // printing new line
		    System.out.println("----Value of Copy Array are : ----" ); 
		   
		    displayArray(copyArr); //calling  display method
		   
		    System.out.println(); // printing new line
		    System.out.println("----Value of Clone Array are : ----" ); 
		   
		    displayArray(cloneArray); //calling  display method
	  
   }
   // end of method
   
   // method to display an array
   static void displayArray(int myArray[])
   {
	   // loop to print array elements
      for(int i:myArray)
	  {
	   System.out.print(i+ "  ");// printing an array element
	  }
	  // end of for
   }
   
   // main method
   public static void main(String ...args)
   {
	   //declaring an array
	   int arr[]={1,2,3,4};
	   
	   // calling the method copyArray
       copyArray(arr);
   
   }

// end of main

} 

// end of class CloneArrayDemo