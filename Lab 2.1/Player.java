public class Player {
    private String name;
    private String choice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        return name + " chose " + choice + ".";
    } 
}
