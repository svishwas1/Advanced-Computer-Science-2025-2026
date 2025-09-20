public class Student {
    private String name;
    private String id;
    private int grade;
    private Student latestOpp;
    private Student recentFriend;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();

    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public Student(String name, int grade, Student latestOpp, Student recentFriend) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
        this.latestOpp = latestOpp;
        this.recentFriend = recentFriend;
    }

    public Student(String name, Student latestOpp, Student recentFriend) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
        this.latestOpp = latestOpp;
        this.recentFriend = recentFriend;
    }

    public void setLatestOpp(Student newLatestOpp) {
        latestOpp = newLatestOpp;
    }

    public void setRecentFriend(Student newRecentFriend) {
        recentFriend = newRecentFriend;
    }

    public Student getLatestOpp() {
        return latestOpp;
    }

    public Student getRecentFriend() {
        return recentFriend;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }
    
    public void setName(String newName) {
        name = newName;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }
 
    public void setId(String idNumber) {
        id = idNumber;
    }

    private String generateId() {
        int d1 = ((int) (Math.random() * 8)) + 1;
        int d2 = ((int) (Math.random() * 8)) + 1;
        int d3 = ((int) (Math.random() * 8)) + 1;
        int d4 = (int) (Math.random() * 10);
        int d5 = (int) (Math.random() * 10);
        int d6 = (int) (Math.random() * 10);
        int d7 = (int) (Math.random() * 10);
        String idNumber = (d1 + "" + d2 + "" + d3 + "-" + d4 + "" + d5 + "" + d6 + "" + d7);
        return idNumber;
    }

    public String vibeCheck(Student otherStudent) {
        if (this.latestOpp.equals(otherStudent.latestOpp)) {
            otherStudent.setRecentFriend(this);
            this.setRecentFriend(otherStudent);
            return this.getName()
                + " and " 
                + otherStudent.getName() 
                + " are now friends! They both dislike "
                + latestOpp.getName();
        } else {
            return this.getName() 
                + " and "
                + otherStudent.getName()
                + " are not friends. They don't dislike the same person";
        }
    }

    @Override

    public String toString() {
        return name 
            + " is a "
            + grade 
            + "th grade student. Their id is "
            + id;
    }

    public boolean equals(Student otherStudent) {
        return this.name.equals(otherStudent.name) 
            && this.grade == otherStudent.grade 
            && this.id.equals(otherStudent.id);
    }
}
