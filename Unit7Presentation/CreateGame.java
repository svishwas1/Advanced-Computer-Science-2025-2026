public class CreateGame {
    //Create the private instance variables
    private int [][] room;
    private int numCols;
    private int numRows;
    private String name;

    CreateGame (String difficulty, String name) {
        if (difficulty.equals("hard")) {
            numCols = 8;
            numRows = 10;
        } else if (difficulty.equals("middle")) {
            numCols = 4;
            numRows = 6;
        } else if (difficulty.equals("easy")) {
            numCols = 2;
            numRows = 4;
        } else {
            throw new IllegalArgumentException("Invalid difficulty");
        }
        room = new int[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                int value = (int) (Math.random() * 10);
                room[r][c] = value;
            }
        }
        this.name = name;
    }

    public void changeRoom() {
        for (int r = 0; )
    }


    

}