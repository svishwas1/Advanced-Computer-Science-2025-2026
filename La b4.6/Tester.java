import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> answerKey = new ArrayList<String> ();
        answerKey.add("A");
        answerKey.add("A");
        answerKey.add("A");
        answerKey.add("A");

        StudentAnswerSheet student1 = new StudentAnswerSheet("Shriya", answerKey);
        ArrayList<StudentAnswerSheet> submissions = new ArrayList<StudentAnswerSheet>();
        TestResults results = new TestResults(answerKey, submissions);

        StudentAnswerSheet student2 = new StudentAnswerSheet("Shriya", answerKey);


        results.submit(student2);
        
    }
}
