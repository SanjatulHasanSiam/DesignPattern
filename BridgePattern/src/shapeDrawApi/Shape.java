package shapeDrawApi;

public abstract class Shape {
protected DrawAPI drawAPI;

public Shape(DrawAPI drawAPI) {
	super();
	this.drawAPI = drawAPI;
}
public abstract void draw();
}

class Circle extends Shape{
private int x,y,radius;

	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
	super(drawAPI);
	this.x = x;
	this.y = y;
	this.radius = radius;
}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
		
	}
	
}