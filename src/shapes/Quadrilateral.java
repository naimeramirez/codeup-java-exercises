package shapes;

abstract class Quadrilateral extends Shape{
    protected double width;
    protected double length;

    public Quadrilateral(double width, double length) {
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
