package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);

    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getLength() {
        return length;
    }
    @Override
    public double getWidth() {
        return width;
    }

}












//public class Rectangle {
//                protected double length;
//                protected double width;
//
//                public double getArea() {
//                return length * width;
//                }
//                public double getPerimeter() {
//                return 2 * length + 2 * width;
//                }
//
//                public double getLength() {
//                return length;
//                }
//
//                public void setLength(double length) {
//                this.length = length;
//                }
//
//                public double getWidth() {
//                return width;
//                }
//
//                public void setWidth(double width) {
//                this.width = width;
//                }
//
//                public Rectangle() {
//
//                }
//                public void setSide(double side){
//                this.length = side;
//                this.width = side;
//                }
//
//                public Rectangle(double length, double width) {
//                this.length = length;
//                this.width = width;
//                }
//                }
