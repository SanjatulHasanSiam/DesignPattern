package burgerShop;

public interface Burger {
public void payment();
public int price();
}
class BeefBurger implements Burger{
private int price=200;
	@Override
	public void payment() {
		System.out.println("Burger name: Beef Burger only 200 Taka");
	}

	@Override
	public int price() {
		return price;
	}	
}
class VegBurger implements Burger{
private int price=100;
	@Override
	public void payment() {
		System.out.println("Burger name: Vegitable Burger only 100 Taka");
	}

	@Override
	public int price() {
		return price;
	}	
}
class TurkeyBurger implements Burger{
private int price=300;
	@Override
	public void payment() {
		System.out.println("Burger name: Turkey Burger only 300 Taka");
	}

	@Override
	public int price() {
		return price;
	}	
}


abstract class BurgerDecorator implements Burger{
	
	protected Burger burger;

	public BurgerDecorator(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public void payment() {
		burger.payment();
	}

	@Override
	public int price() {
		return burger.price();
	}
	
}

class ExtraCheese extends BurgerDecorator{

	public ExtraCheese(Burger burger) {
		super(burger);
	}
	@Override
	public void payment() {
		System.out.println("With extra Cheese Bill(+100): "+(super.price()+100));
	}
	
}