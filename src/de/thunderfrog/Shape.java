package de.thunderfrog;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String nColor, boolean nfilled){
        this.color = nColor;
        this.filled = nfilled;
    }

    public Shape() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return "";
    }

}
