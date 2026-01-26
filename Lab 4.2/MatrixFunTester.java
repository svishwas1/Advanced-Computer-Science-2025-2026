public class MatrixFunTester {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        //Creating an object of MatrixFun class 
        MatrixFun m = new MatrixFun();

        //Testing validateStarterMatrix 
        int[][] wrong = new int[][] {{1, 2, 3}, {}, {2, 3, 4}};
        try {
            MatrixFun wrongMatrix = new MatrixFun(wrong);      
        } catch (Exception e) {
            System.out.println("The matrix is not rectangular as expected.");
        }

        //Testing out toString
        System.out.println(m.toString());
        
        //Tesing equals method
        //Expected false
        MatrixFun m1 = new MatrixFun(2, 4);
        System.out.println(m.equals(m1));

        //Expected true
        int[][] createMatrix = new int[][] {{1, 2, 3}, {1, 2, 3}};
        MatrixFun m2 = new MatrixFun(createMatrix);
        MatrixFun m3 = new MatrixFun(createMatrix);
        System.out.println(m2.equals(m3));

        //Testing second equals method
        //Expected true
        System.out.println(m2.equals(createMatrix));

        //Testing replaceAll method
        int[][] createMatrix1 = new int[][] {{1, 1, 3}, {4, 5, 6}, {1, 1, 1}};
        MatrixFun m4 = new MatrixFun(createMatrix1);
        System.out.println(m4.toString());
        m4.replaceAll(1, 9);
        System.out.println(m4.toString());

        //Testing swapRow method
        int[][] createMatrix2 = new int[][] {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixFun m5 = new MatrixFun(createMatrix2);
        System.out.println(m5.toString());
        m5.swapRow(0, 1);
        System.out.println(m5.toString());
    }
}