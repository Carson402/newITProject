import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;

public class SupportTicket {

    private String custFirstName;
    private String custLastName;
    private String custEmail;
    private DateTimeAtCreation timeAtCreation;

    public SupportTicket(String custFirstName, String custLastName, String custEmail, DateTimeAtCreation timeAtCreation) {
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
        this.custEmail = custEmail;
        this.timeAtCreation = timeAtCreation;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public DateTimeAtCreation getTimeAtCreation() {
        return timeAtCreation;
    }

    public void setTimeAtCreation(DateTimeAtCreation timeAtCreation) {
        this.timeAtCreation = timeAtCreation;
    }
}
