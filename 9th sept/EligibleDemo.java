/*
Program: Elgibility for college
@author: Abhishek Sharma
@date: 9th sept 2022

*/
//  declaring class

class EligibleDemo
{
	//calling main method
	public static final void main(String args[])
	{
		float totalMarks= Float.parseFloat(args[0]); //Taking input and parsing
		float pcmMarks= Float.parseFloat(args[1]);
		
		//Nested if
		if(totalMarks>=60)
		{
			if((totalMarks>=80) || (pcmMarks>=85))
			{
				System.out.println("You are eligible to take addmission in B.tech"); //eligible in college as well as in B.tech
			}
			//end of inner if
			else
			{
				System.out.println("You are eligible to take addmission but not in (B.TECH)"); //eligible in college only
			}
			//end of inner else
		}// end of outer if
		else
		{
			System.out.println("You are not eligible to take addmision in college"); // not eligible in college
		}//end of outer else
	}
	//end of main
}//end of class EligibleDemo
