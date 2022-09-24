/*
Program: Creating Product class with Enacapsulation
@author: Abhishek Sharma
@date: 21th sept 2022
*/

//declare class Product
class Product
{
	//declare Imstace variable
	private String name;
	private int quantity;
	private double totalPrice;
	
	//----Default Constructor---//
	Product()
	{
		
	}
	//---Paramaterized Constructor---//
	Product(String name,int quantity,double unitPrice)
	{
		this.name = name;
		this.quantity = quantity;
		this.totalPrice = quantity*unitPrice; //calculating peruint price
		
	}
	//declaring getter(Accessor) and setter(Mutator)//
	public String getName() //getter method for getName
	{
		return this.name;
	}
	
	public void setName(String name) //setter method for setName
	{ 
		this.name=name;
	}
	
	public int getQuantity() //getter method for getQuantity
	{
		return this.quantity;
	}
	
	public void setQuantity(int quantity) //setter method for getQuantity
	{
		this.quantity=quantity;
	}
	
	public double getTotalPrice() //getter method for getTotalPrice
	{
		return this.totalPrice;
	}
	
	public void setTotalPrice(double totalPrice) //setter method for getTotalPrice
	{
		this.totalPrice=totalPrice;
	}
	
} //end of class

