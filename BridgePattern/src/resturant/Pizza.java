package resturant;

public abstract class Pizza {
	
protected String sauce;
protected String toppings;
protected String crust;

public abstract void assemble();
public abstract void qualityCheck();

}

class PepperoniPizza extends Pizza{

	@Override
	public void assemble() {
		System.out.println("Adding sauce: "+sauce);
		System.out.println("Adding toppings: "+toppings);
		System.out.println("Adding pepperoni");
	}

	@Override
	public void qualityCheck() {
		System.out.println("Crust is "+crust);
		
	}
	
}

class VeggiePizza extends Pizza{

	@Override
	public void assemble() {
		System.out.println("Adding sauce: "+sauce);
		System.out.println("Adding toppings: "+toppings);
		System.out.println("Adding Cheese");
	}

	@Override
	public void qualityCheck() {
		System.out.println("Crust is "+crust);
		
	}
	
}