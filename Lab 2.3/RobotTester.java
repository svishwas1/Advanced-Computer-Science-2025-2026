public class RobotTester {
    public static void main(String[] args) {
        int[] hall = {1, 1, 2, 2};
        Robot robby = new Robot(hall, 1);
        
        //Testing display state
        robby.displayState();

        //Testing getters
        System.out.println(robby.getPosition());
        System.out.println(robby.isFacingRight());
        
        //Testing display state and clear hall
        int moveCount = robby.clearHall();
        System.out.println("The total number of moves to clear this hall: " + moveCount);
        System.out.println("Did the robot complete the hall with exactly 9 moves? " 
            + (moveCount == 9 ? "Yes." : "No."));

        //Displaying hall after being cleared 
        robby.displayState();
        
        int [] hall1 = {2, 1, 0, 1};
        Robot robo = new Robot(hall1, 2);
        
        //Testing move method
        robo.displayState();
        robo.move();
        robo.displayState();

        //Checking if hall is clear for a cleard and non cleared hall
        System.out.println(robo.hallIsClear());
        System.out.println(robby.hallIsClear());

        //Checking if robot is at a wall with one tru and one false case
        System.out.println(robo.isRobotBlockedByWall());
        System.out.println(robby.isRobotBlockedByWall());

        //Putting position greater than limit
        int [] hall2 = {0, 1, 1, 1};
        Robot badRobot = new Robot(hall2, 30);
        badRobot.displayState();

        badRobot.setPosition(-10);
        badRobot.displayState();

        //Testing hallway with negative values
        int [] hall3 = {-1, 2, -3, 4}; 
        Robot badHallRobot = new Robot(hall3, 0);
        badHallRobot.displayState();
    }
}
