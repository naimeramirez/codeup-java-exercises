package shapes;

public class Square extends Rectangle{

    protected double side;

    public Square(double side) {
        super(side, side);
    }

    public double getAreaSquare() {
        return side * side;
    }

    public double getPerimeterSquare() {
        return side * 4;
    }


}
