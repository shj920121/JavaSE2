package method;

public class FigureMain {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(6,5);
		System.out.println(triangle.getArea());
		
		Rectangle rectangle = new Rectangle(5,7);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(5);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		
		
		
		
		
		
	}
}
