import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;
import java.util.HashMap;

public class SupportTicket {

    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private Date date;
    private String timeAtCreation;
    private String message;
    private Integer ticketNumber;
    private static int ticketCounter;

    public SupportTicket(String customerFirstName, String customerLastName, String customerEmail, String message) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.timeAtCreation = String.valueOf(date.getTime());
        this.message = message;
        this.ticketNumber = ticketCounter;
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
