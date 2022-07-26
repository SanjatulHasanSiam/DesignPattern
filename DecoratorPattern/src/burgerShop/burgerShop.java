package burgerShop;

public class burgerShop {

	public static void main(String[] args) {
		Burger beef=new BeefBurger();
		System.out.println("Normal Burger Order: ");
		beef.payment();
		System.out.println();
		
		beef=new ExtraCheese(new TurkeyBurger());
		System.out.println("With Extra Cheese: ");
		beef.payment();
	}

}
