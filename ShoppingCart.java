/*
Program: Creating Shopping cart of product
@author: Abhishek Sharma
@date: 21th sept 2022
*/

//declare class ShoppingCart
class ShoppingCart
{
	//--Instance Variable--//
	private Product[] cart ;
	private double billAmount;
	private int storedItems;
	
	//----No Arguement Constructor---//
	ShoppingCart()
	{
		cart = new Product[5]; //craeting cart object of Product class
	}
	//---Paramaterized Constructor---//
	ShoppingCart(int size)
	{
		cart = new Product[size]; //craeting cart object of Product class and giving size
		
	}
	//method for Calculating Total Price
	public double calculateBill()
	{
		for(int i=0;i<cart.length;i++)
		{
			billAmount+=cart[i].getTotalPrice();  //calculate Total Price
		}
		return billAmount; 
	}//end of method calculateBill
	
	//method for Adding Products In the Cart
	public void addProduct(Product input)
	{
		//if Statement
		if(storedItems<cart.length)
		{
			cart[storedItems]=input;
			storedItems++;
			System.out.println(input.getName() + ": " + input.getTotalPrice()); //printing Item name And price
		} //end of If
		
		else
		{
			System.out.println("Shoping cart is full"); //printing Cart is full 
		} //end of else
	}//end of method addProduct
} //end of class ShoppingCart
	