
/*
Program: Creation of  cart
@author: Abhishek Sharma
@date: 21th sept 2022
*/
class TestCart
{
	public static void main(String...args)
	{
		//----------Constructor Inhection----------//
		
		System.out.println("-------------------");
		Product mobile = new Product ("Apple_mobile",2,182255);
		Product scale = new Product("pionier",4,60);
		Product mouse = new Product ("logitech",2,2854);
		Product monitor = new Product("Dell",1,22000);
		
		ShoppingCart myCart = new ShoppingCart();
		
		myCart.addProduct(mobile);
		myCart.addProduct(scale);
		myCart.addProduct(mouse);
		myCart.addProduct(monitor);
		
		System.out.println("-------Your total bill --------");
		
		System.out.println("Bill Amount :"+myCart.calculateBill());
		System.out.println("-------------------");
	}
}