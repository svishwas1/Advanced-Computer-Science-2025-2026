public class CourseTester {
    public static void main(String[] args) {
        int[] scores = {90, 89, 91, 95};
        int[] scores1 = {100, 50, 89, 75};
        StudentRecord ana = new StudentRecord("Ana", scores);
        StudentRecord shriya = new StudentRecord("Shriya", scores1);
        
        System.out.println(ana.toString().equals("Ana's scores: [90, 89, 91, 95]"));
        System.out.println(ana.toString());
        System.out.println(ana.getAverage(0, 3));
        System.out.println(ana.getTestScore(1));
        System.out.println(ana.getFinalAverage());
        System.out.println(ana.hasImproved());
        
        StudentRecord[] students = {ana, shriya};
        Course school = new Course("School", students);
        System.out.println(school.toString());
        System.out.println(school.findBestStudent());
        System.out.println(school.calculateTestAverage(3));
    }
}