package shapeDrawApi;

public class shapeDrawn {
public static void main(String []args) {
	
	Shape redCircle=new Circle(new RedCircle(),95,34,100);
	redCircle.draw();
	System.out.println();
	
	
	Shape greenCircle=new Circle(new GreenCircle(),95,34,100);
	greenCircle.draw();
	
}
}
