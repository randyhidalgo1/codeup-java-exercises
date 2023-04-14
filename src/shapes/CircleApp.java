package shapes;
import java.util.Scanner;
import static java.lang.System.out;
import util.Input;

public class CircleApp {
    private static int totalCircles = 0;

    public static void main(String[] args) {
        Input input = new Input();
        boolean anotherCircle;

        do {
            double radius = input.getDouble("Enter the radius of the circle: ");
            Circle circle = new Circle(radius);
            out.printf("Circumference: %.2f\n", circle.getCircumference());
            out.printf("Area: %.2f\n", circle.getArea());
            totalCircles++;
            anotherCircle = input.yesNo("Do you want to create another circle? ");
        } while (anotherCircle);

        out.println("Total number of circles created: " + getTotalCircles());
    }

    private static int getTotalCircles() {
        return totalCircles;
    }
}

