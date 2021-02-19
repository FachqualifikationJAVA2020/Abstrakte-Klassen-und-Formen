package b.klassen;


public class Nicole_Circle extends Nicole_Shape {
	protected double radius;
	
	public Nicole_Circle() {
		
	}
	
	public Nicole_Circle(double radius) {
		this.radius = radius;
	}
	
	
	public Nicole_Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.round((getRadius() * 2) * (Math.PI));
	}
	
	public double getPerimeter() {
		return Math.round((Math.PI * 2 ) * (getRadius()));
	}
	
	public String toString() {
		return "Area: "+ getArea() + "; Perimeter: "+ getPerimeter();
	}
}

