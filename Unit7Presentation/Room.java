public class Room {
    private int [][] room;
    private int numCols;
    private int numRows;
    private int guesses;

    public Room(String difficulty) {
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
        guesses = 0;
    }

    public void displayRoom() {
        System.out.println("Room shown!");
        for (int r = 0; r < numRows; r++) {
            for (int c = r; c < numCols; c++) {
                System.out.print(room[r][c]);
            }
            System.out.println();
        }
        
    }

    public boolean guessNum(int num) {
        for (int r = 0; r < numRows; r++) {
            for (int c = r; c < numCols; c++) {
                if (room[r][c] == num) {
                    return true;
                }
            }
        }
        guesses++;
        return false;
    }

}
//Implement binary sort where the user guesses the number at the array and then narrow down the pool of searches after each guess if the user hasn't guessed the actual value