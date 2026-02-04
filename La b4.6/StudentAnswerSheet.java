import java.util.ArrayList;

public class StudentAnswerSheet {
    String name;
    double testScore;
    ArrayList<String> answers;

    StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (answers == null || key == null) {
            throw new IllegalArgumentException("Answers cannot be null");
        }
        double points = 0;
        for (int i = 0; i < answers.size(); i++) {
            if (key.get(i).equals(answers.get(i))) {
                points++;      
            } else if (!answers.get(i).equals(key.get(i)) 
                && !answers.get(i).equals("?")) {
                    points = points - 0.25;
            }
        }
        return points;
    }


    
}