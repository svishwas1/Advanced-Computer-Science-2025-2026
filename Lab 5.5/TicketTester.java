import java.util.Date;

public class TicketTester {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Date today = new Date();
        // to-do: uncomment the following lines to test your code.

        StandardTicket standardTicket = new StandardTicket(today, 3);
        standardTicket.printTicketDetails();
        System.out.println();

        MemberTicket memberTicket = new MemberTicket(today, 3);
        memberTicket.printTicketDetails();
        System.out.println();

        StudentTicket studentTicket = new StudentTicket(today, 3);
        studentTicket.printTicketDetails();
        System.out.println();
        
    }
}