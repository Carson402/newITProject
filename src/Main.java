

public class Main {
    public static void main(String[] args) {

        TicketManager db = new TicketManager();

        SupportTicket ticket1;
        db.addTicket(ticket1 = new SupportTicket(
                "Sally","Jones",
                "sjones@gmail.com",
                "My pc wont work. I think the hardware is bad."));
        System.out.println(db.getTicket(1).toString());

    }
}
