package shapes;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return (this.length + this.width) * 2;
    }

    public double getPerimeter() {
        return this.length * this.width;
    }
}
