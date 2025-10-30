public class TriangleLoops {
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        if (numberOfRows < 0) {
            return "Cannot have negative rows";
        }

        if (numberOfRows == 0) {
            return "Cannot have 0 rows";
        }
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
        if (numberOfRows < 0) {
            return "Cannot have negative rows";
        }

        if (numberOfRows == 0) {
            return "Cannot have 0 rows";
        }
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows; j >= i; j--) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    } 

    public static String createNumbersTriangle(int numberOfRows) {
        if (numberOfRows < 0) {
            return "Cannot have negative rows";
        }

        if (numberOfRows == 0) {
            return "Cannot have 0 rows";
        }
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                triangle = triangle + i + " ";
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        if (numberOfRows < 0) {
            return "Cannot have negative rows";
        }

        if (numberOfRows == 0) {
            return "Cannot have 0 rows";
        }
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        for (int i = 1; i <= numberOfRows; i++) {
            int numSpaces = numberOfRows - i;
            for (int m = 1; m <= numSpaces; m++) {
                triangle = triangle + " ";
            }
            for (int k = 65; k <= 64 + i; k++) {
                triangle = triangle + (char) (k);
            }
            for (int s = 64 + i; s > 65; s--) {
                triangle = triangle + (char) (s - 1);
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }
}
