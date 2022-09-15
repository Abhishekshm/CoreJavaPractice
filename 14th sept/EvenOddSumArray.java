/*
Program: Taking and input from user Array
@author: Abhishek Sharma
@date: 14th sept 2022

*/
//  declaring class
import java.util.Scanner;
class EvenOddSumArray
{
	static void evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of the Array");
		int size =sc.nextInt();
		
		int evenSum=0,oddSum=0;
		int arr[]= new int[size];
		System.out.println("Enter the elements of Array :  ");
		
		//Enetering the Elements of Array
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum+=arr[i];
			}
			else
			{
				oddSum+=arr[i];
			}
			
		}
		System.out.println("The Sum of Even Numbers Are: "+evenSum);
			System.out.println("The Sum of Odd Numbers Are: "+oddSum);
	}
	//calling main method
	public static void main(String args[])
	{
		evenOdd();
	}
	//end of main
}//end of class EvenOddSumArray