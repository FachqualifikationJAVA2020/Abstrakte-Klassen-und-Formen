package de.thunderfrog;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
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
        return "Die Fläche beträgt: " + getArea() + " | Der Umfrag beträgt: " + getPerimeter();
    }

}
