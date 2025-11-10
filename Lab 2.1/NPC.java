public class NPC {
    private String choice;

    public NPC() {
        this.choice = generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        String lowerChoice = choice.toLowerCase();
        if (lowerChoice.equals("rock") || lowerChoice.equals("paper") || lowerChoice.equals("scissors")) {
            this.choice = lowerChoice;
        } else {
            this.choice = generateRandomCHoice();
        }
    }
    
    @Override
    public String toString() {
        return "Opponent chose" + choice + ".";
    }

}