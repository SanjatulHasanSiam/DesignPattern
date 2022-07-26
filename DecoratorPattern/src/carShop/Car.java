package carShop;

public interface Car {
public void design();
}


class PrivateCar implements Car{

	@Override
	public void design() {
		System.out.println("Vehicle Type: Private Car. ");
		
	}
	
}


class Bus implements Car{

	@Override
	public void design() {
		System.out.println("Vehicle Type: Bus. ");
		
	}
	
}


class Truck implements Car{

	@Override
	public void design() {
		System.out.println("Vehicle Type: Truck. ");
		
	}
}


class CarDecorator implements Car{
private Car car;
	public CarDecorator(Car car) {
	this.car = car;
}
	@Override
	public void design() {
		this.car.design();
	}	
}



class Luxary extends CarDecorator{

	public Luxary(Car car) {
		super(car);
	}
	
	@Override
	public void design() {
		super.design();
		System.out.println("Vehicle Class: Luxary");
	}	
	
}


class Economy extends CarDecorator{

	public Economy(Car car) {
		super(car);
	}
	
	@Override
	public void design() {
		super.design();
		System.out.println("Vehicle Class: Economy");
	}	
	
}


class Standard extends CarDecorator{

	public Standard(Car car) {
		super(car);
	}
	
	@Override
	public void design() {
		super.design();
		System.out.println("Vehicle Class: Standard");
	}	
	
}

