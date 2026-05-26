public class Player {
    private String name;
    private boolean playedBefore;
    private int numOfGuesses;
    private int numOfHints;
    private int position;

    Player(String name, boolean playedBefore, int numOfGuesses, int numOfHints, int position) {
        this.name = name;
        this.playedBefore = playedBefore;
        this.numOfGuesses = numOfGuesses;
        this.numOfHints = numOfHints;
        this.position = 0;

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public boolean isPlayedBefore() {
        return playedBefore;
    }


    public void setPlayedBefore(boolean playedBefore) {
        this.playedBefore = playedBefore;
    }


    public int getNumOfGuesses() {
        return numOfGuesses;
    }


    public void setNumOfGuesses(int numOfGuesses) {
        this.numOfGuesses = numOfGuesses;
    }


    public int getNumOfHints() {
        return numOfHints;
    }


    public void setNumOfHints(int numOfHints) {
        this.numOfHints = numOfHints;
    }

    public int getPosition() {
        return position;
    }
    
     public void setPosition(int position) {
        this.position = position;
    }
}
