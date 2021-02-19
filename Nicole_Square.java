package b.klassen;

public class Nicole_Square extends Nicole_Rectangle {
	public Nicole_Square() {
		 
	}

    public Nicole_Square(double side){
        super(side,side);
    }

    public Nicole_Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.width = side;
        this.length = side;
    }


    public String toString() {
        return "Area: " + getArea() + "; Perimeter: " + getPerimeter();
    }

}
