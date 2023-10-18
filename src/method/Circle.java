package method;

public class Circle {
	double r;

	public Circle(double radius) {
		super();
		this.r = radius;
	}
	double getArea() {
	return r * r * Math.PI;
	}
	double getCircumference() {
		return 2 * r * Math.PI;
	}
	
	
}