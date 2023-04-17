package shapes;

public class Square extends Rectangle{

public Square(){
        }

            public double getSide(){
            return this.length;
            }

            public void setSide(double side){
            this.length = side;
            this.width = side;
            }

            public double getArea(){
            return Math.pow(this.length, 2);
            }

            @Override
            public double getPerimeter() {
            return 4 * this.length;
            }

            public void setWidth(double side){
            this.setSide(side);
            }

            public void setLength(double side){
            this.setSide(side);
            }

            }
