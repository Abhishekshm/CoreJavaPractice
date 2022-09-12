/*
Program: Grading System
@author: Abhishek Sharma
@date: 12th sept 2022

*/
//  declaring class

class GradingSystem{

	//calling main method
  public static void main(String[] args){
	  
	  int marks=Integer.parseInt(args[0]); //taking input and parsing
    
    if(marks<25) //outer if
	{
      System.out.println("F"); // Printing F
    }
    else if((marks>=25)&&(marks<45))
	{
      System.out.println("E");  //Printing E
    }
    else if((marks>=45)&&(marks<50))
	{
      System.out.println("D"); //Printing D
    }
    else if((marks>=50)&&(marks<60))
	{
      System.out.println("C"); //Printing C
    }
    else if((marks>=60)&&(marks<80))
	{
      System.out.println("B"); //Printing B
    }
    else if((marks>=80)&&(marks<=100))
	{
      System.out.println("A"); //Printing A
    }
    else
	{
      System.out.println("Wrong Marks");
    } // end of if-else ladder
	
  }//end of main
  
}  //end of class GradingSystems