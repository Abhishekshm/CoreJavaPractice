/*
Program: Operators in Java
@author: Abhishek Sharma
@date: 7th sept 2022

*/
//  declaring class
class OperatorDemo
{
	//calling main method
	public static final void main(String args[])
	{
		byte b1= 5;
		byte b2= 9;
		int sum = b1+b2; //artehmatic Operation always holds Integer values
		System.out.println("The sum is : "+sum);
		System.out.println("");
		
		
		double f1=7.54;
		double f2=5.33;
		float f3=(float) (f1+f2);
		System.out.println("The sum is : "+f3);
		System.out.println("");
		
		
		int divisor=8;
		int dividend=67;
		int q= dividend/divisor;   //Quoteient
		int r= dividend%divisor;   //Remainder
		System.out.println("The quoteient is: "+q);
		System.out.println("The remainder is: "+r);
		System.out.println("");
		
		System.out.println("Version Of Java is: "+System.getProperty("java.version"));
	}
	//end of main
}//end of class OperatorDemo
