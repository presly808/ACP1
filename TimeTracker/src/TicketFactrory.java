import ua.com.artcode.model.Ticket;
import ua.com.artcode.model.User;

import java.util.Date;

/**
 * Created by admin on 09.06.2014.
 */
public class TicketFactrory {

    public static Ticket startTicket(String desc, String fullDesc, User user) {
        return new Ticket(desc, fullDesc, user);
    }

    public static Ticket fillTicketManually(String title, String description, Date start, Date end, User user){
        return new Ticket(user,start,end,description,title);
    }

}
