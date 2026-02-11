public class Triangle extends Polygon{
    double base;
    double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        this(3, 4);
    }

    @Override
    public double getArea() {
        return (base * height * 0.5);
    }

    @Override
    public String toString() {
        return 
            super.toString() + "It is a triangle with a base of " + base
          + "and height of " + height + ". It's area is " + getArea();
    }
}
