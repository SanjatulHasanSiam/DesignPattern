package resturant;

public abstract class Resturant {
protected Pizza pizza;

public Resturant(Pizza pizza) {
	this.pizza = pizza;
}

abstract void addSauce();
abstract void addToppings();
abstract void makeCrust();

public void deliver() {
	addToppings();
	addSauce();
	makeCrust();
	pizza.assemble();
	pizza.qualityCheck();
	System.out.println("Order in progress");
}

}


class ItalianResturant extends Resturant{

	public ItalianResturant(Pizza pizza) {
		super(pizza);
	}

	@Override
	void addSauce() {
		pizza.sauce="Tomatoo";
	}

	@Override
	void addToppings() {
		pizza.toppings="Round";
	}

	@Override
	void makeCrust() {
		pizza.crust="Thin";
		
	}
	
}

class AmericanResturant extends Resturant{

	public AmericanResturant(Pizza pizza) {
		super(pizza);
	}

	@Override
	void addSauce() {
		pizza.sauce="Chilli";
	}

	@Override
	void addToppings() {
		pizza.toppings="Square";
	}

	@Override
	void makeCrust() {
		pizza.crust="Large";
		
	}
	
}

