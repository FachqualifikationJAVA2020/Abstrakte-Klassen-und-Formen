package b.klassen;

public class Nicole_ShapeTest {
    public static void main(String[] args) {

        Nicole_Circle circle = new Nicole_Circle(3,"mint",true);
        System.out.println(circle.toString());


        Nicole_Rectangle rectangle = new Nicole_Rectangle(4.4,5.5,"lightsalmon",true);
        System.out.println(rectangle.toString());


        Nicole_Square square = new Nicole_Square(6.6,"lightcyan",true);
        System.out.println(square.toString());
    }
}
