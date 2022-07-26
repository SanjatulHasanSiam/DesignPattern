package tpFacade;

public interface Shape {
public void draw();
}
class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle is drawn");
		
	}
	
}
class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
		
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square is drawn");
		
	}
	
}



class ShapeMaker{
	private Circle circle;
	private Rectangle rectangle;
	private Square square;
	public ShapeMaker() {
		circle=new Circle();
		rectangle =new Rectangle();
		square =new Square();
	}
	public void draw() {
		circle.draw();
		rectangle.draw();
		square.draw();
	}
	
	
}


