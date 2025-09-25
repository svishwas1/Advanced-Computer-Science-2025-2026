public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17); 

        //Testing toString which should be Equation: 5x + 4y -17
        String line1Info = line1.toString();
        System.out.println("Line1 - " + line1Info);

        // slope1 should be -1.25
        double slope1 = line1.calculateSlope();
        System.out.println("Slope of Line1: " + slope1);

        // Shouldbe true, as 5(5) + 4(-2) + (-17) = 0
        boolean onLine1 = line1.isCoordinateOnLine(5, -2);
        System.out.println("Is the point (5, -2) on the line? " + onLine1);
        


        //Testing Line 2
        Line line2 = new Line(-25, 40, 30);

        //Testing toString which should be Equation: -25x + 40y + 30
        String line2Info = line2.toString();
        System.out.println("\nLine2 - " + line2Info);

        // Slope 2 should be 0.625
        double slope2 = line2.calculateSlope();
        System.out.println("Slope of Line2: " + slope2);

        // Should be false as -25(5) + 40(-2) + 30 != 0
        boolean onLine2 = line2.isCoordinateOnLine(5, -2);
        System.out.println("Is the point (5, -2) on the line? " + onLine2);
        


        //Testing Line 3
        Line line3 = new Line(3, 7, -9);

        //Testing toString which should be Equation: 3x +7y -9
        String line3Info = line3.toString();
        System.out.println("\nLine3 - " + line3Info);

        // Slope 3 should be -1.666..(repeating 6)
        double slope3 = line3.calculateSlope();
        System.out.println("Slope of Line3: " + slope3);

        // Should be false as 3(1) + 7(1) - 9 != 0
        boolean onLine3 = line3.isCoordinateOnLine(1, 1);
        System.out.println("Is the point (5, -2) on the line? " + onLine3);


        //Testing Line 4
        Line line4 = new Line(10, 13, 5);

        //Testing toString which should be Equation: 10x + 13y + 5
        String line4Info = line4.toString();
        System.out.println("\nLine 4 - " + line4Info);

        // Slope 4 should be -0.65 
        double slope4 = line4.calculateSlope();
        System.out.println("Slope of Line4: " + slope4);

        // Should be false 10(1) + 13(-7) + 5 != 0
        boolean onLine4 = line4.isCoordinateOnLine(1, -7);
        System.out.println("Is the point (5, -2) on the line? " + onLine4);


        //Testing Line 5
        Line line5 = new Line(17, 1, -1);

        //Testing toString which should be Equation: 17x + y -1
        String line5Info = line5.toString();
        System.out.println("\nLine 5 -  " + line5Info);

        // Slope 5 should be -0.294117647
        double slope5 = line5.calculateSlope();
        System.out.println("Slope of Line5: " + slope5);

        // Should be false 17(2) + 1(3) - 1 != 0
        boolean onLine5 = line5.isCoordinateOnLine(2, 3);
        System.out.println("Is the point (2, 3) on the line? " + onLine5);
    }
}
