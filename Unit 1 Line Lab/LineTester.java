public class LineTester {
    public static void main(String[] args) {
        //Creating four point objects 
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        //Creating a new Line object
        Line pointLine = new Line(p1, p2);

        //Calculating Slope of the Line using calculateSlope()
        double s1 = pointLine.calculateSlope();
        System.out.println("Using calculateSlope(): " + s1);

        //Calculating Slope of the Line using CalculatesSlopeFromPoints()
        double s2 = pointLine.calculateSlopeFromPoints();
        System.out.println("Using calculateSlopeFromPoints(): " + s2);

        if (s1 == s2) {
            System.out.println("Slopes are equal.");
        } else {
            System.out.println("Slopes are not equal.");
        }

        //Testing isOnLine for four points created above
        System.out.println("Is p1 on the line? " + pointLine.isCoordinateOnLine(p1));
        System.out.println("Is p2 on the line? " + pointLine.isCoordinateOnLine(p2));
        System.out.println("Is p3 on the line? " + pointLine.isCoordinateOnLine(p3));
        System.out.println("Is p4 on the line? " + pointLine.isCoordinateOnLine(p4));
    }
}
