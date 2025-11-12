import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter your choice: ");
        String choice = scan.nextLine();
        
        int attempts = 0;
        while (!validateChoice(choice) && attempts < 2) {
            System.out.print("Enter your choice: ");
            choice = scan.nextLine();
            attempts++;
        }
        if (attempts > 1) {
            System.out.println(("You have put three invalid attempts!"
                + " Computer will generate your move"));
            choice = generateRandomChoice();
        }
        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && opponent.getChoice().equals("scissors")) {
            return true;
        }
        if (player.getChoice().equals("paper") && opponent.getChoice().equals("rock")) {
            return true;
        }
        if (player.getChoice().equals("scissors") && opponent.getChoice().equals("paper")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (didPlayerWin()) {
            return player.getName() + " won!"
                + " Congratulations!";
        } else {
            return "Opponent won!"
                + " Better luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS =="
            + "\n" + player.getName() + " chose " + player.getChoice() + "."
            + "\nOpponent choice " + opponent.getChoice() + "."
            + "\n" + toString();
    }

    public static boolean validateChoice(String choice) {
        return choice.equals("rock") || choice.equals("scissors") || choice.equals("paper");
    }

    public static String generateRandomChoice() {
        int num = (int) (Math.random()* 3) + 1;
        if (num == 1) {
            return "rock";
        }
        if (num == 2) {
            return "paper";
        }
        return "scissors";
    }

}
