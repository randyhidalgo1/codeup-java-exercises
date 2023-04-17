package shapes;

public class ShapesTest extends Rectangle{
    public static void main(String[] args) {

        Rectangle box1 = new box1 ();
        box1.setLength(5);
        box1.setWidth(4);
        System.out.println("box1 Perimeter: " + box1.getPerimeter() + " Area: " + box1.getArea());

        Rectangle box2 = new box2 ();
        box2.setSide(5);
        System.out.println("box2 Perimeter: " + box2.getPerimeter() + " Area: " + box2.getArea());

    }
}

