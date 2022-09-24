/*
Program: Wrapper calss Autoboxing and Unboxing
@author: Abhishek Sharma
@date: 23th sept 2022
*/
//declaring class WrapperDemo
class WrapperDemo
{
	//method for main main method
	public static void main(String...args)
	{
		//-----------Autoboxing Integer-------------------//
		int primitiveA =5;
		Integer objectA = primitiveA;
		System.out.println("Autoboxing Integer  : "+objectA);
		System.out.println("----------------------------------");
		
		//-----------Autoboxing Float-------------------//
		float primitiveB =4f;
		Float objectB = primitiveB;
		System.out.println("Autoboxing Float  : "+objectB);
		System.out.println("----------------------------------");
		
		//-----------Autoboxing Byte-------------------//
		byte primitiveC = 6;
		Byte objectC = primitiveC;
		System.out.println("Autoboxing Byte  : "+objectC);
		System.out.println("----------------------------------");
		
		//-----------Autoboxing Short-------------------//
		short primitiveD = 7;
		Short objectD = primitiveD;
		System.out.println("Autoboxing Short  : "+objectD);
		System.out.println("----------------------------------");
		
		//-----------Autoboxing Double-------------------//
		double primitiveE = 2.0;
		Double objectE = primitiveE;
		System.out.println("Autoboxing Double  : "+objectE);
		System.out.println("----------------------------------");
		
		//-----------Autoboxing Double-------------------//
		long primitiveF = 7l;
		Long objectF = primitiveF;
		System.out.println("Autoboxing Long  : "+objectF);
		System.out.println("----------------------------------");
		
	}//end of main method
}//end of class