package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    @Override
    public double setLength(double length) {
        this.length = length;
        return length;
    }

    @Override
    public double getArea() {
        return (this.length + this.width) * 2;
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }
}
