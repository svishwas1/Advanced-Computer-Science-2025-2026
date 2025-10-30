

public class TriangleLoopsTester {
    public static void main(String[] args) {
        //Testing createLetterTriangleUp with a good case and an invalid case
        System.out.println(TriangleLoops.createLetterTriangleUp(5, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(-3, 'B'));

        //Testing createLetterTriangleDown with a good case and an invalid case
        System.out.println(TriangleLoops.createLetterTriangleDown(6, 'S'));
        System.out.println(TriangleLoops.createLetterTriangleUp(0, 'M'));

        //Testing createNumbersTriangle with createNumbersTriangle 
        //with a good case and 2 invalid cases
        System.out.println(TriangleLoops.createNumbersTriangle(4));
        System.out.println(TriangleLoops.createAlphabetTriangle(0));
        System.out.println(TriangleLoops.createAlphabetTriangle(-5));

        //Testing createAlphabetTriangle 
        //with valid case, a case with more than 26 rows and an invalid case
        System.out.println(TriangleLoops.createAlphabetTriangle(7));
        System.out.println(TriangleLoops.createAlphabetTriangle(27));
        System.out.println(TriangleLoops.createAlphabetTriangle(-10));
    }
}
