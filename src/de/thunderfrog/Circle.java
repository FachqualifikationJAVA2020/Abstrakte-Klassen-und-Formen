package de.thunderfrog;

public class Circle extends Shape{
    protected double radius;

    public Circle() {}

    public Circle(double radius, String color, boolean filled){
        // Ruft den Konstruktor der Eltern Klasse auf
        super(color,filled);

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Flächenberechnung
    public double getArea() {
        return (Math.PI) * radius * radius;
    }

    // Umfang berechnung
    public double getPerimeter() {
        return 2 * (Math.PI) * radius;
    }

    public String toString() {
        return "Die Fläche beträgt: " + getArea() + " | Der Umfrag beträgt: " + getPerimeter();
    }
}
