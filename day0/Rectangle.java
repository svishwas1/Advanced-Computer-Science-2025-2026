public class Rectangle {
    private int length; 
    private int width;

    // constructors
    //general default constructor
    //Constructor has to always match the name of the class
    public Rectangle() {
        //Initialize the private instance variables
        length = 6;
        width = 7;
    }

    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;
    }

    //getters lets you get the private instance variables from the class

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setters 
    public void setLength(int newLength) {
        length = newLength; 
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    //methods
    public int getArea() {
        int area = length * width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt((length * length) + (width * width));
        return diagonal;
    }

    @Override

    public String toString() {
        return "Rectangle Information"
             + "length is: " + length 
             + "\nwidth is: " + width 
             + "\nArea is: " + getArea() 
             + "\nPerimeter is: " + getPerimeter();
    }

    public boolean equals(Rectangle otherRectangle) {
        if (this.length == otherRectangle.length && this.width == otherRectangle.width) {
            return true;
        } else {
            return false;
        }
    }

}
