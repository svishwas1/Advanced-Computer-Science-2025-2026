public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        hallway = fixHallway(hallwayToClean);
        position = fixStartingPosition(startingPosition);
        isFacingRight = true;
    }
    
    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = fixHallway(hallway);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = fixStartingPosition(position);
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */

    public int fixStartingPosition(int startingPosition) {
        if (startingPosition > 3) {
            position = 3;
        } else if (startingPosition < 0) {
            position = 0;
        } else {
            position = startingPosition;
        }
        return position;
    }

    public int[] fixHallway(int[] hallwayToClean) {
        for (int i = 0; i < hallwayToClean.length; i++) {
            if (hallwayToClean[i] < 0) {
                hallwayToClean[i] = 0;
            }
        }
        return hallwayToClean;
    }

    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        return (isFacingRight == true && position == 3 || isFacingRight == false && position == 0);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        if (hallway[position] > 1) {
            hallway[position] = hallway[position] - 1;
        } else if (hallway[position] == 1) {
            hallway[position] = hallway[position] - 1;
            if (isFacingRight == true && position != 3) {
                position++;
            } else if (isFacingRight == true && position == 3) {
                isFacingRight = false;
            } else if (isFacingRight == false && position != 0) {
                position--;
            } else {
                isFacingRight = true;
            }
        } else if (hallway[position] == 0) {
            if (isFacingRight == true && position != 3) {
                position++;
            } else if (isFacingRight == true && position == 3) {
                isFacingRight = false;
            } else if (isFacingRight == false && position != 0) {
                position--;
            } else {
                isFacingRight = true;
            }
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        displayState();
        while (!hallIsClear()) {
            move();
            count++;
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        String hallwayNumbers = "";
        for (int i = 0; i < hallway.length; i++) {
            if (i == hallway.length - 1) {
                hallwayNumbers = hallwayNumbers + hallway[i];
            } else {
                hallwayNumbers = hallwayNumbers + hallway[i] + " ";
            }
        }
        System.out.println(hallwayNumbers);
        for (int i = 0; i < (position * 2); i++) {
            System.out.print(" ");
        }
        if (isFacingRight) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
    }
}
