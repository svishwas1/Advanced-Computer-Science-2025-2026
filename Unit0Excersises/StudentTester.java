public class StudentTester {
    public static void main(String[] args) {
        //Creating 4 objects to test the Student class
        Student shriya = new Student("Shriya", 11);
        Student olivia = new Student("Olivia", 5);
        Student lucy = new Student("Lucy");
        Student nicole = new Student("Nicole");
        
        //Printing student information using to string method
        System.out.println("STUDENT INFORMATION");
        System.out.println(shriya.toString());
        System.out.println(olivia.toString());
        System.out.println(lucy.toString());
        System.out.println(nicole.toString());

        //Changing the value for grade for each student
        shriya.setGrade(12);
        olivia.setGrade(6);
        lucy.setGrade(11);
        nicole.setGrade(11);

        //Reprinting student information using the to string method
        System.out.println("\nREPRINTING STUDENT INFORMATION");
        System.out.println(shriya.toString());
        System.out.println(olivia.toString());
        System.out.println(lucy.toString());
        System.out.println(nicole.toString());

        //Testing to see if two objects match using the equals method
        System.out.println("\nSTUDENTS MATCHING");
        System.out.println("Do the two students " 
            + shriya.getName() + " and "
            + olivia.getName() + " match? " 
            + shriya.equals(olivia));
        System.out.println("Do another two students " 
            + lucy.getName() 
            +  " and " 
            + nicole.getName() 
            + " match? " 
            +  lucy.equals(nicole));
        System.out.println(" ");

        Student chetana = new Student("Chetana", shriya, lucy);
        Student vishwas = new Student("Vishwas", 11, shriya, olivia);
        Student orion = new Student("Orion", vishwas, shriya);

        //Testing out the vibe method with two objects that have the same opp
        //Printing the result of the vibe check which the two student objects should have passed
        System.out.println(vishwas.vibeCheck(chetana));

        //Testing out the vibe method with two objects that don't have the same opp
        //Printing the result of the vibe check which the two student objects should not have passed
        System.out.println(orion.vibeCheck(chetana));

    }
}
