package b.klassen;

public class Nicole_Rectangle extends Nicole_Shape{
	protected double width;
	protected double length;
	
	public Nicole_Rectangle() {
		
	}
	
	public Nicole_Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Nicole_Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
        this.length = length;
	}
	
	public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public String toString() {
        return "Area: " + getArea() + "; Perimeter: " + getPerimeter();
    }
}
