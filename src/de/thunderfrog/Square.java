package de.thunderfrog;

public class Square extends Rectangle{

    public Square() {}

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
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
        return "Die Fläche beträgt: " + getArea() + " | Der Umfrag beträgt: " + getPerimeter();
    }


}
