/*
Program: Static caclulator
@author: Abhishek Sharma
@date: 22th sept 2022
*/
import java.util.Scanner; //importing Scanner class
//declraing class Calculator
class Calculator
{
	static double answer =0.0;
	
	double addition(double num1, double num2 )
	{
		return num1+num2;
	}
	double subtraction(double num1, double num2 )
	{
		return num1-num2;
	}
	double multiplication(double num1, double num2 )
	{
		return num1*num2;
	}
	double division(double num1, double num2 )
	{
		return num1/num2;
	}
	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		double number1,number2;
		char operator,choice;
		
		System.out.println("------Calculator-------");
		System.out.println("Enetr 1st Number: ");
		number1 = sc.nextDouble();
		System.out.println("Enetr 2nd Number: ");
		number2 = sc.nextDouble();
		
		Calculator c1 = new Calculator();
		while(true)
		{
			System.out.println("Enter Operator you want to perform(+,-,*,/)");
			operator = sc.next().charAt(0);
			switch(operator)
			{
				case '+' : Calculator.answer=c1.addition(number1,number2);
							break;
				case '-' : Calculator.answer=c1.subtraction(number1,number2);
							break;
				case '*' : Calculator.answer=c1.multiplication(number1,number2);
							break;
				case '/' : Calculator.answer=c1.division(number1,number2);
							break;
				default : System.out.println("------Wrong Input-------");
				
			}
			System.out.println(number1+"  "+ operator +" "+number2+" = "+Calculator.answer);
			System.out.println("Get result or perform more operations (y/n)");
			choice =sc.next().toLowerCase().charAt(0);
			if(choice=='y')
			{
				
				number1 = Calculator.answer;
				System.out.println("Enter number : ");
				
				number2 = sc.nextDouble();
			}
			else
				break;
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Result is : "+Calculator.answer);
	}
}
	
	
	