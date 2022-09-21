/*
Program: deleting duplicate values in an array
@author: Abhishek Sharma
@date: 15th sept 2022
*/

import java.util.Scanner;
class PrintDuplicateArray
{
	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int rows= sc.nextInt();


		int arr[]= new int[rows];

		System.out.println("Enter the elements:");


		for(int i=0;i<rows;i++)
		{

	     	arr[i]= sc.nextInt();


		}


		System.out.println();

		System.out.println("Array elements are:");
         displayArray(arr);


		System.out.println();

		System.out.println("Duplicate elements are:");
         duplicate(arr);

	}

	static void displayArray(int myArray[])
	{

	   System.out.println();

		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");

		}

	}

   static void duplicate(int ar[])
   {
	   for(int i=0; i<ar.length;i++)
	   {
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]==ar[j])
				   System.out.print(ar[i]+ "  ");
		   }

	   }
   }

   public static void main(String ...args)
  {

     inputArray();

  }


}   