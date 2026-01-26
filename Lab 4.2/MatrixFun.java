public class MatrixFun {
    int[][] m;

    @SuppressWarnings("OverridableMethodCallInConstructor")

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Cannot input negative rows/columns");
        }
        m = new int [numberOfRows][numberOfCols];
        generateNumbers(m);
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")

    public MatrixFun(int[][] starterMatrix) {
        m = validateStarterMatrix(starterMatrix);
    }

    public MatrixFun() {
        this(3, 3);
    }

    public void generateNumbers(int[][] m) {
        for (int[] newMatrix1 : m) {
            for (int c = 0; c < newMatrix1.length; c++) {
                newMatrix1[c] = (int) (Math.random() * 10);
            }
        }
    }

    public int[][] validateStarterMatrix(int[][] m) {
        int rowLength = m[0].length;
        for (int[] m1 : m) {
            if (m1.length != rowLength) {
                throw new IllegalArgumentException("Matrix must be rectangular");
            } 
        }
        return m;
    }

    public int[][] getMatrix() {
        return m;
    }

    public void setMatrix(int[][] m) {
        this.m = m;
    }

    @Override
    public String toString() {
        String content = "";
        int numColumns = m[0].length;
        for (int[] m1 : m) {
            for (int c = 0; c < m[0].length; c++) {
                content = content + m1[c] + " ";
            }
            content = content + "\n";
        }
        String equals = "=".repeat((2 * numColumns) - 1);
        return (equals + "\n" + content + equals);
    }

    public boolean equals(MatrixFun m) {
        return this.toString().equals(m.toString());
    }

    public boolean equals(int[][] m) {
        MatrixFun matrix1 = new MatrixFun(m);
        return this.equals(matrix1);
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int[] m1 : m) {
            for (int c = 0; c < m[0].length; c++) {
                if (m1[c] == oldValue) {
                    m1[c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA >= m.length || rowB >= m.length || rowA < 0 || rowB < 0) {
            throw new IllegalArgumentException("Invalid row numbers");
        }
        for (int c = 0; c < m[rowA].length; c++) {
            int valueA = m[rowA][c];
            int valueB = m[rowB][c];
            m[rowA][c] = valueB;
            m[rowB][c] = valueA;
        }
    }  
}