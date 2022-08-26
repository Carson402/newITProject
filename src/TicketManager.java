import java.util.HashMap;

public class TicketManager {


    private static final HashMap<Integer,SupportTicket> ticketHashMap = new HashMap<>();

    public TicketManager() {

    }

    public void addTicket(SupportTicket ticket) {
        ticketHashMap.put(ticket.getTicketNumber(),ticket);
    }

    public SupportTicket getTicket(int ticketNumber) {
        return ticketHashMap.get(ticketNumber);
    }
}
