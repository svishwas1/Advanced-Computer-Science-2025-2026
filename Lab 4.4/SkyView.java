public class SkyView {
    @SuppressWarnings("FieldMayBeFinal")
    private double[][] view;

    @SuppressWarnings("OverridableMethodCallInConstructor")

    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (scanned.length != numberOfCols * numberOfRows) {
            throw new IllegalArgumentException("Invalid number of rows/columns");
        }
        numberOfRows = validate(numberOfRows);
        numberOfCols = validate(numberOfCols);

        view = new double[numberOfRows][numberOfCols];

        int count = 0;
        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[count];
                    count++;
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[count];
                    count++;
                }
            }
        }  
    }

    public int validate(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        } else {
            return value;
        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    @Override
    public String toString() {
        String values = "";
        for (double[] view1 : view) {
            for (int c = 0; c < view[0].length; c++) {
                values = values + view1[c] + " ";
            }
            values = values + "\n";
        }
        return values;
    }

    public boolean equals(SkyView skyView) {
        if (skyView.view.length != this.view.length 
            || skyView.view[0].length != this.view[0].length) {
            return false;
        }
        for (int r = 0; r < skyView.view.length; r++) {
            for (int c = 0; c < skyView.view[r].length; c++) {
                if (skyView.view[r][c] != this.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0;
        int count = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                total += view[r][c];
                count++;
            }
        }
        return (double) total / count;
    }
}