package shapes;

public class Rectangle {
                protected double length;
                protected double width;

                public double getArea() {
                return length * width;
                }
                public double getPerimeter() {
                return 2 * length + 2 * width;
                }

                public double getLength() {
                return length;
                }

                public void setLength(double length) {
                this.length = length;
                }

                public double getWidth() {
                return width;
                }

                public void setWidth(double width) {
                this.width = width;
                }

                public Rectangle() {

                }
                public void setSide(double side){
                this.length = side;
                this.width = side;
                }
                }
