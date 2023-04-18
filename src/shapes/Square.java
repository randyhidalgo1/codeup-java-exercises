package shapes;


public class Square extends Quadrilateral{

    public Square(double length, double width) {
        super(length, width);
    }

        @Override
        public double getPerimeter() {
            return 4 * this.length;
        }

        @Override
        public double getArea() {
            return Math.pow(this.length, 2);
        }

        @Override
        public void setLength(double length) {
            this.length = length;
            this.width = length;
        }

        @Override
        public void setWidth(double width) {
            this.width = width;
            this.length = width;
        }
}


















//public class Square extends Rectangle{
//
//public Square(){
//        }
//
//            public double getSide(){
//            return this.length;
//            }
//
//            public void setSide(double side){
//            this.length = side;
//            this.width = side;
//            }
//
//            public double getArea(){
//            return Math.pow(this.length, 2);
//            }
//
//            @Override
//            public double getPerimeter() {
//            return 4 * this.length;
//            }
//
//            public void setWidth(double side){
//            this.setSide(side);
//            }
//
//            public void setLength(double side){
//            this.setSide(side);
//            }
//
//            public Square(double side) {
//                super(side, side);
//            }
//            }
