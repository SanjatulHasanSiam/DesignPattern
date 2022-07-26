package carShop;

public class Customer {

	public static void main(String[] args) {
		System.out.println("<------Luxary class Bus------>");
		Car busLuxary=new Luxary(new Bus());
		busLuxary.design();
		System.out.println();
		
		System.out.println("<-------Economy class Truck------->");
		Truck truck=new Truck();
		Car truckEconomy=new Luxary(truck);
		truckEconomy.design();
		System.out.println();
		
	
	}

}
