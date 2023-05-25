package shapes;
//
public class Square extends Quadrilateral implements Measurable{

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double setWidth(double width) {
        this.width = side;
        return width;
    }

    @Override
    public double setLength(double length) {
        this.length = side;
        return length;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }


}
