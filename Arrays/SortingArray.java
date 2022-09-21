/*
Program: Sorting of an array
@author: Abhishek Sharma
@date: 15th sept 2022

*/
//  declaring class

import java.util.Scanner;
class SortingArray
{
	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size Of the Array");
		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+"elements in The Array ");
		for(int i=0 ; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("-------Array before Sorting--------");
		displayArray(arr);
		sortArray(arr);
	}
	
	static void sortArray(int myArry[])
	{
		
		int temp;
		for(int i=0;i<myArry.length-1;i++)
		{
			for(int j=i+1;j<myArry.length;j++)
			{
				if(myArry[i]>myArry[j])
				{
					temp = myArry[i];
					myArry[i]=myArry[j];
					myArry[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("----Array After Sorting-----");
		displayArray(myArry);
	}
	static void displayArray(int ar[])
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	}
	//calling main method
	public static void main(String... args)
	{
		inputArray();
	}
	//end of main
}//end of class SortingArray