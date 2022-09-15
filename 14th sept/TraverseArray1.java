/*
Program: Taking and input from user Array
@author: Abhishek Sharma
@date: 14th sept 2022

*/
//  declaring class

import java.util.Scanner;
class TraverseArray1
{
	static void inputArray(int num)
	{
		int j=1;
		int newArray[]= new int[num];
		for(int i=0;i<num;i++)
		{
			newArray[i]=j;
			j=j+2;
		}
		System.out.println();
		System.out.println();
		System.out.println("Elements of Array are: ");
		
		for(int i=0;i<num;i++)
		{
			System.out.println(newArray[i]);
		}
		
	}
	//calling main method
	public static final void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the size of the array:");
		int size= sc.nextInt();
		inputArray(size);
	}
	//end of main
}//end of class TraverseArray1