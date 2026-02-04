import java.util.ArrayList;

public class TestResults {
    ArrayList<String> answerKey;
    ArrayList<StudentAnswerSheet> submissions;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Key/Sumbissions cannot be null");
        }
        this.answerKey = key;
        this.submissions = submissions;
        gradeTests();
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }
    
    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            submissions.get(i).setTestScore(submissions.get(i).getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.isEmpty()) {
            return "";
        }
        double highest = 0;
        String highestPerson = "";
        for (int i = 0; i < submissions.size(); i++) {
            if (submissions.get(i).getTestScore() > highest) {
                highest = submissions.get(i).getTestScore();
                highestPerson = submissions.get(i).getName();
            }
        }
        return highestPerson;
    }
}
