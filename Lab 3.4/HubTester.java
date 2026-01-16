public class HubTester {
    public static void main(String[] args) {
        Hub hub = new Hub();
        try {
            hub.registerStudent("Shriya", "hrurury", "svishwas@gmail");
            hub.registerStudent("Olivia", "127273d", "olivia@gmail");
            hub.registerStudent("Bernard", "flamingo", "Bernard@yahoo.com");
            hub.registerStudent("CJ", "13736", "CJ@gmail.com");
            hub.registerStudent("Serena", "288337", "serena@mai.com");
            hub.registerStudent("Vishwas", "eheeie", "vishwas@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }


        try {
            hub.loginStudent("chetana", "dudyff");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Exception student does not exist as expected");
        }

        try {
            hub.loginStudent("Shriya", "dudyff");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception student password incorrect as expected");

        }

       /*  try {
            hub.doesStudentExist("Shriya");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception student password incorrect as expected");

        }
        */




    }
}
