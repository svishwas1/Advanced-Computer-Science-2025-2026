public class RectangleTester {
    public static void main(String[] args) {
        //Declaration: type name
        //Instantiation/Initialization: = new type();
        Rectangle shriya = new Rectangle(8);
        Rectangle olivia = new Rectangle(6, 7);

        System.out.println("\nSHRIYA'S RECTANGLE");
        System.out.println("Testing Shriya's getwidth: " + shriya.getWidth());
        System.out.println("Testing Shriya's getWidth: " + shriya.getLength());

        System.out.println("\nTesting setLength: at first, length is " + olivia.getLength());
        olivia.setLength(8);
        System.out.println("After the setter, length is " + olivia.getLength());

        System.out.println("\nTesting setWidth: at first width is " + shriya.getWidth());
        shriya.setWidth(9);
        System.out.println("After the setter, width is " + shriya.getWidth());

        System.out.println("\nArea of the rectangle is: " + shriya.getArea());
        System.out.println("Perimeter of the rectangle is: " + shriya.getPerimeter());
        System.out.println("The diagonal length of the rectangle is: " + shriya.getDiagonal());
        
        System.out.println(shriya.toString());
        System.out.println("Does Shriya's Rectangle Match Olivia's Rectangle? " 
            + shriya.equals(olivia));

    }
}
