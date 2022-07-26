package resturant;

public class Customer {

	public static void main(String[] args) {
		System.out.println("<--------- American Pepperoni Pizza ------------->");
		Resturant americanPeperoni=new AmericanResturant(new PepperoniPizza());
		americanPeperoni.deliver();
		System.out.println("<---------  ------------->");
		System.out.println("<--------- Italian Veggie Pizza ------------->");
		ItalianResturant italianPeperoni=new ItalianResturant(new VeggiePizza());
		italianPeperoni.deliver();
		System.out.println("<---------  ------------->");
	}

}
