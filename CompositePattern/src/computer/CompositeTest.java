package computer;

public class CompositeTest {

	public static void main(String[] args) {
	Components hd=new Leaf(4000,"Harddrive");	
	Components mouse=new Leaf(500,"Mouse");	
	Components monitor=new Leaf(10000,"Monitor");	
	Components ram=new Leaf(4200,"RAM");	
	Components processor=new Leaf(19000,"Processor");	

	
	Composite ph=new Composite("Peripharal");
	Composite cb=new Composite("Cabinet");
	Composite mb=new Composite("MotherBoard");
	Composite Computer=new Composite("Computer");
	
	ph.addComponents(mouse);
	ph.addComponents(monitor);
	
	mb.addComponents(processor);
	mb.addComponents(ram);
	
	cb.addComponents(hd);
	cb.addComponents(mb);
	
	Computer.addComponents(ph);
	Computer.addComponents(mb);
	Computer.addComponents(cb);
	
	ram.showPrice();
	ph.showPrice();
	
	Computer.showPrice();
	}

}
