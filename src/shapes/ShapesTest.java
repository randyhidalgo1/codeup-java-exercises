package shapes;

public class ShapesTest extends Rectangle{
    public ShapesTest(double length, double width) {
        super(length, width);
    }
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(7,8);
        System.out.println("My Rectangle perimeter: " + myShape.getPerimeter() + " Area: " + myShape.getArea());

        Measurable myShape1 = new Square(10,10);
        System.out.println("My Square perimeter: " + myShape1.getPerimeter() + " Area: " + myShape1.getArea());


//        Rectangle box1 = new Rectangle ();
//        box1.setLength(5);
//        box1.setWidth(4);
//        System.out.println("Rectangle Perimeter: " + box1.getPerimeter() + " Area: " + box1.getArea());
//
//        Rectangle box2 = new Square ();
//        box2.setSide(5);
//        System.out.println("Square Perimeter: " + box2.getPerimeter() + " Area: " + box2.getArea());


    }
}

