public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        super(4, 4);
    }

    @Override
    public String toString() {
        return 
            super.toString() + "It is also a square.";
    }


}
