package shapes;
//
public class Square extends Quadrilateral{

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }
//
//    @Override
//    public double getArea() {
//        return this.side * this.side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return this.side * 4;
//    }
//
//
}
