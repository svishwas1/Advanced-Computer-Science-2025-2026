

public class HubTester {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(null, "password1", "student1@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase name cannot be null as expected.");
        }

        try {
            Student student2 = new Student("", "password2", "student2@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase name cannot be empty as expected.");
        }

        try {
            Student student3 = new Student("Shriya", null, "Shriya@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase password cannot be null as expected.");
        }

        try {
            Student student4 = new Student("Olivia", " ", "Olivia@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase password cannot be empty as expected.");
        }

        try {
            Student student5 = new Student("Chetana", "spice", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase the email is null as expected");
        }

        try {
            Student student6 = new Student("Chetana", "spice", " ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase the email is empty as expected");
        }
    
        try {
            Student student7 = new Student("Chetana", "spice", "NoEmail@");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase the email does not have . as expected");
        }

        try {
            Student student17 = new Student("Bluey", "Glue", "NoEmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase the email does not have @ as expected");
        }

        try {
            Student student8 = new Student("Shriya@", "pumpkin", "pumkin@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase the name contains @ as expected");
        }

        try {
            Student student9 = new Student("Orion", "password7", "Orion@.com");
            Student student10 = new Student("Orion", "password8", "Orion@hwemail.com");
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error"
                + "becuase cannot create two students with same name as expected");
        }

        try {
            Student student11 = new Student("Ricardo", "Flamingo", "Ricardo@.com");
            student11.changeName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase change name to a null value as expected");
        }

        try {
            Student student12 = new Student("Eduard", "Watermelon", "Eduard@.com");
            student12.changeName(" ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase change name to a an empty value as expected");
        }

        try {
            Student student13 = new Student("Steve", "Apple", "Steve@.com");
            student13.changeName("Steve@");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error becuase change name to a name with @ as expected");
        }

        try {
            Student student14 = new Student("Vishwas", "Salmon", "Vishwas@.com");
            Student student15 = new Student("Bunny", "Pepper", "Bunny@.com");
            student15.changeName("Vishwas");
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
            System.out.println("Threw method threw an error"
                + "Cannot change name of a student to a name that already exists as expected");
        }

        try {
            Student student18 = new Student("Noodles", "pink", "Noodles@.com");
            for (int i = 0; i < 6; i++) {
                student18.submitAssignment("Homework." + i, "Description." + i);
            }
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
            System.out.println("Threw method threw an error"
                + "Cannot sumbit more than five assignments as expected");
        }

        try {
            Student student19 = new Student("Joe", "Coffee", "Joe@.com");
            student19.submitAssignment(null, "null homework to do");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error cannot have null title as expected");
        }

        try {
            Student student20 = new Student("Peep", "Brew", "Peep@.com");
            student20.submitAssignment(" ", "empty homework to do");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error cannot have empty title as expected");
        }

        try {
            Student student21 = new Student("Smity", "Straw", "Peep@.com");
            student21.submitAssignment("Biology", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error cannot have null description as expected");
        }

        try {
            Student student21 = new Student("Fork", "banana", "Peep@.com");
            student21.submitAssignment("Math", " ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error cannot have empty description as expected");
        }
        Hub h = new Hub();

        try {
            h.registerStudent(null, "p1", "e1@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because name cannot be null as expected");
        }

        try {
            h.registerStudent(" ", "p1", "e1@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because name cannot be empty as expected");
        }

        try {
            h.registerStudent("N1", null, "e1@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the password cannot be null as expected");
        }

        try {
            h.registerStudent("N2", " ", "e1@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the password cannot be empty as expected");
        }

        try {
            h.registerStudent("N3", "Password", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the email cannot be null as expected");
        }

        try {
            h.registerStudent("N4", "Password", " ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the email cannot be empty as expected");
        }

        try {
            h.registerStudent("N5", "Password", "email1@");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the email does not contain . as expected");
        }

        try {
            h.registerStudent("N6", "Password", "email1.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the email does not contain @ as expected");
        }

        try {
            h.registerStudent("N7@", "Password", "email1@.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the name contains @ as expected");
        }

        try {
            h.registerStudent("N8", "Password", "email1@.com");
            h.registerStudent("N8", "Password", "email1@.com");
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error" 
                + "Cannot register two students with same name as expected");
        }

        try {
            h.loginStudent(null, "password");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error - cannot have null username as expected");
        }

        try {
            h.loginStudent(" ", "password");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error - cannot have an empty username as expected");
        }

        try {
            h.loginStudent("username1", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error - cannot have a null password as expected");
        }

        try {
            h.loginStudent("username1", " ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error - cannot have an empty password as expected");
        }

        try {
            h.registerStudent("name1", "password1", "name@.com");
            h.loginStudent("No Name", "password");
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error"
                +  "cannot login a student that does not registered as expected");
        }

        try {
            h.registerStudent("Blah", "password1", "name@.com");
            h.loginStudent("Blah", "bad");
        } catch (SecurityException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error"
                + "Cannot login a student when passwords do not match as expected");
        }

        try {
            h.doesStudentExist(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error"
                + "Cannot check if student exists with null name as expected"
            );
        }

        try {
            h.doesStudentExist(" ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error"
                + "Cannot check if student exists with an empty name as expected"
            );
        }

        try {
            h.registerStudent("Book", "reading", "book@.com");
            h.doesStudentExist("Book");
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
            System.out.println("Method threw an error because student already exists as expected");
        }


        



        










        






    }
}
