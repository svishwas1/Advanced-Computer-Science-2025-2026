public class Line {
    int a;
    int b; 
    int c;
    private Point p1;
    private Point p2;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void setPoint1(Point p1) {
        this.p1 = p1;
    }

    public Point getPoint1() {
        return p1;
    }

    public void setPoint2(Point p2) {
        this.p2 = p2;
    }

    public Point getPoint2() {
        return p2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public double calculateSlope() {
        double slope = -((double) a / b);
        return slope;
    }

    public double calculateSlopeFromPoints() {
        double slope = (p1.getY() - p2.getY())/(p1.getX() - p2.getX());
        return slope;
    }

    public boolean isCoordinateOnLine(Point p) {
        return a * p.getX() + b * p.getY() + c == 0;
    }

    public String generatePointSlopeFormula() {
        double slope = calculateSlopeFromPoints();
        return "(y - " + p1.getY() + ") = " + slope + "(x - " + p1.getX();
    }

    @Override
    public String toString() {
        if (b > 0) {
            if (c > 0) {
                return "Equation: "
                    + a
                    + "x + "
                    + b 
                    + "y + "
                    + c;
            } else {
                return "Equation: "
                    + a
                    + "x + "
                    + b 
                    + "y "
                    + c;
            }
        } else {
            if (c > 0) {
                return "Equation: "
                    + a
                    + "x "
                    + b 
                    + "y + "
                    + c;
            } else {
                return "Equation: "
                    + a
                    + "x "
                    + b 
                    + "y "
                    + c;
            }
        }
    }

    public boolean equals(Line otherLine) {
        return this.a == otherLine.a && this.b == otherLine.b && this.c == otherLine.c;
    }
}