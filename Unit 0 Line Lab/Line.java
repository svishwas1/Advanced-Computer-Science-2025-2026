public class Line {
    int a;
    int b; 
    int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public boolean isCoordinateOnLine(int x, int y) {
        return a * x + b * y + c == 0;
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
