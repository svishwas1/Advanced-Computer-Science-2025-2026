public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;
    
    private String[] words = new String[5]; //creating a new string array with 5 null values (if you dont know values but know length)
    StudentRecord s1 = new StudentRecord(courseName, null);
    StudentRecord s2 = new StudentRecord(courseName, null);
    private StudentRecord[] student = {s1, s2};
    private String[] names = {"Shriya", "Vishwas"}; //creating a new string array with predinfined strings (if you know everything)
    private String[] stuff; //Creating a container for a string array but nothing in it


    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        int i = 0;
        while (enrolledStudents[i] != null) {
            i++;
        } 
        if (enrolledStudents[i] == null) {
            enrolledStudents[i] = student;
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                if (enrolledStudents[i].equals(student)) {
                    enrolledStudents[i] = null;
                    return true;
                }
            }
        }
        return false;
    }


    public int countEnrolledStudents() {
        int numStudents = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                numStudents++;
            }
        }
        return numStudents;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] increasedRecords = 
            new StudentRecord[sizeIncrease + enrolledStudents.length];
        for (int i = 0; i < enrolledStudents.length; i++) {
            enrolledStudents[i] = increasedRecords[i];
        }
        enrolledStudents = increasedRecords;
    }

}