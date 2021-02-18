package de.thunderfrog;

public class ShapeTest {
    public static void main(String[] args) {
        // Kreis
        Circle cl = new Circle(7,"BLUE",false);
        System.out.println(cl.toString());

        // Rechteck
        Rectangle rl = new Rectangle(4.2,4.8,"ORANGE",true);
        System.out.println(rl.toString());

        // Quadrat
        Square sl = new Square(8,"GREEN",false);
        System.out.println(sl.toString());
    }
}
