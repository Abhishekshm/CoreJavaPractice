/*
Program: MAtrix operations  in an array
@author: Abhishek Sharma
@date: 15th sept 2022
*/

import java.util.Scanner;  //importing Scanner class 
class MatrixOperations
{
	//declare static displayArray method
	static void displayArray(int resMatrix[][])
	{
		for(int[] arrayRow:resMatrix)
		{
			for(int myrow:arrayRow)
			{
				System.out.print(myrow+ "  ");
			}

			System.out.println();

		}

	}
	
	//declare static method for Addition
	static void additionMatrix(int ar1[][], int ar2[][])
	{
		int rarr[][] = new int[3][3];
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				rarr[i][j]= ar1[i][j]+ar2[i][j];
			}
			// end of innerloop
		}
		// end of outer loop
		System.out.println();
		System.out.println("The resultant matrix after addition is :");
		displayArray(rarr);

	}
	
	//declare static method for Subtraction
	static void subtractionMatrix(int ar1[][], int ar2[][])
	{
		int rarr[][] = new int[3][3];
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				rarr[i][j]= ar1[i][j]-ar2[i][j];
			}
			// end of innerloop
		}
		// end of outer loop
		System.out.println();
		System.out.println("The resultant matrix after subtraction is :");
		displayArray(rarr);

	}
	
	//declare static method for multiplication
	static void multiplicationMatrix(int ar1[][], int ar2[][])
	{
		int rarr[][] = new int[3][3];
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				rarr[i][j]=0;
				for(int k=0;k<3;k++)
				{
					rarr[i][j]= rarr[i][j]+(ar1[i][k]*ar2[k][j]);
				}
			}
			// end of innerloop
		}
		// end of outer loop
		System.out.println();
		System.out.println("The resultant matrix after subtraction is :");
		displayArray(rarr);

	}

   public static void main(String ...args)
  {
      Scanner sc= new Scanner(System.in); // creating a scanner class object
	     String ch;

		int arr1[][]= new int[3][3]; // intiializing an Array and giving size
		int arr2[][]= new int[3][3]; // intiializing an Array and giving size

		System.out.println("Enter the elements for 1st array:");

		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				arr1[i][j]= sc.nextInt();
			}
			// end of innerloop
		}
		// end of outer loop

		System.out.println("Enter the elements for 2nd array:");
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				arr2[i][j]= sc.nextInt();
			}
			// end of innerloop
		}
		// end of outer loop

		System.out.println();
		System.out.println("Enter the operation to perfom(add,sub,mul)");

		ch= sc.next().toLowerCase();
		//declaring Switch case
		switch(ch)
		{
			case "add": additionMatrix(arr1,arr2); //case for calling Addition
			            break;
			case "sub": subtractionMatrix(arr1,arr2); //case for calling Subtraction
			            break;
            case "mul": multiplicationMatrix(arr1,arr2); //case for calling Multiplication
			            break; 	
            default: System.out.println("No operation"); //case executed when user gives wrong input
		} 
  }
}   