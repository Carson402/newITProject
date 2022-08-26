import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;

public class SupportTicket {

    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String timeAtCreation;
    private String message;
    private Integer ticketNumber = 0;
    public DateTimeAtCreation dateTimeAtCreation;

    @Override
    public String toString() {

        return "Support Ticket No = " + ticketNumber + "\nFirst Name = " + customerFirstName +
                ", Last Name = " + customerLastName + "\nEmail = " + customerEmail +
                "\nCreated on = " + timeAtCreation + "\nMessage = " + message;
    }

    public SupportTicket(String customerFirstName, String customerLastName, String customerEmail, String message) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        Date date = new Date();
        DateTimeAtCreation dateTimeAtCreation = new DateTimeAtCreation(date);
        this.timeAtCreation = dateTimeAtCreation.toString();
        this.message = message;
        int ticketNo = ticketNumber;
        ticketNumber++;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getTimeAtCreation() {
        return timeAtCreation;
    }

    public void setTimeAtCreation(DateTimeAtCreation timeAtCreation) {
        this.timeAtCreation = String.valueOf(timeAtCreation);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTicketNumber() {
        return this.ticketNumber;
    }

}
