public class Rectangle extends Polygon{
    double width;
    double length;

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this(3.0, 4.0);
    }
    
    @Override
    public double getArea() {
        return (width * length);
    }

    @Override
    public String toString() {
        return 
            super.toString() + "It is a rectangle with a length of " + length
          + "and width of " + width + ". It's area is " + getArea();
    }

}
