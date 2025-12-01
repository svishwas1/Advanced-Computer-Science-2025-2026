public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    // to-do: implement getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }
    // setters
    // to-do: implement setters

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    // inherited methods

    // to-do: implement toString
    @Override
    public String toString() {
        String allStudentsScores = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            allStudentsScores = allStudentsScores + (i + 1) + ".) " 
                + enrolledStudents[i].toString() + "\n";
        }
        return "== " + courseName + " ==\n" + allStudentsScores;
    }

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent
    public String findBestStudent() {
        double highest = 0.0;
        int highestIndex = 0;
        for (int i = 0; i < enrolledStudents.length - 1; i++) {
            if (enrolledStudents[i].getFinalAverage() > highest) {
                highest = enrolledStudents[i].getFinalAverage();
                highestIndex = i;
            }   
        }
        return enrolledStudents[highestIndex].getName();
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
    public double calculateTestAverage(int test) {
        int sum = 0;
        for (int i  = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getTestScore(test);
        }
    
        return (double) sum / enrolledStudents.length;
    }

}