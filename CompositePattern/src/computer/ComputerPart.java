package computer;

import java.util.ArrayList;
import java.util.List;

interface Components{
	void showPrice();
}


class Leaf implements Components{
	int price;
	String name;
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println("Name: "+name+" Price: "+price);
		
	}

}
class Composite implements Components{
	String name;
	
	public Composite(String name) {
		super();
		this.name = name;
	}


	List<Components> components=new ArrayList<>();
	
	
	public void addComponents(Components com) {
		components.add(com);
	}
	
	
	@Override
	public void showPrice() {
		System.out.println(name);
		
		
		for(Components c: components) {
			c.showPrice();
		}
	}
}