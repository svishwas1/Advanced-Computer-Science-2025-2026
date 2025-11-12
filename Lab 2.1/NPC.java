public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        String lowerChoice = choice.toLowerCase();
        if (RPSGame.validateChoice(lowerChoice)) {
            this.choice = lowerChoice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }
    
    @Override
    public String toString() {
        return "Opponent chose " + choice + ".";
    }

}