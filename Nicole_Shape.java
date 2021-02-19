package b.klassen;

public abstract class Nicole_Shape {
	protected String color;
	protected boolean filled;
	
	public Nicole_Shape() {
		
	}
	
	public Nicole_Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void isFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
		
	public String toString() {
		return "";
	}
}
