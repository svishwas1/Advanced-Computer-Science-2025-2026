public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }
    
    // getters
    // to-do: implement getters
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
    // to-do: implement getTestScore

    // inherited methods

    // to-do: implement toString
    @Override
     public String toString() {
        String scoresString = "";
        for (int i = 0; i < scores.length; i++) {
            if (i != scores.length - 1) {
                scoresString = scoresString + scores[i] + ", ";
            } else {
                scoresString = scoresString + scores[i];
            }
        }
        return name + "'s scores: [" + scoresString + "]";
    }

    public boolean comparesScores(StudentRecord other) {
        if (this.getScores().length != other.getScores().length) {
            return false;
        }
        for (int i = 0; i < this.getScores().length; i++) {
            if (this.getScores()[i] != other.getScores()[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(StudentRecord other) {
        return (comparesScores(other) && other.getName().equals(this.getName())); 
    }

    // methods
    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int total = 0;
        int count = 0;
        for (int i = first; i <= last; i++) {
            total = scores[i] + total;
            count++;
        }
        return ((double) total / count);
    }

    public int getTestScore(int testNumber) {
        if (testNumber >= scores.length || testNumber < 0) {
            return -1;
        }
        int index = testNumber;
        int testScore = scores[index];
        return testScore;
    }
    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */

    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] > scores[i]) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        double average;
        if (hasImproved()) {
            average = getAverage(scores.length / 2, scores.length - 1);
        } else {
            average = getAverage(0, scores.length - 1);
        }
        return average;
    }
}
