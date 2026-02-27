import java.util.Date;

public class StudentTicket extends StandardTicket {

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    @Override
    public double getTotalPrice() {
        return ((super.getBasePrice() + (super.getBasePrice() * super.getTax())) *super.getTicketCount()) * 0.5;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    } 
    
}
