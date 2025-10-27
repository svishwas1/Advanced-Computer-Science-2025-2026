public class TriangleLoops {
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows; j >= i; j--) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    } 
}
