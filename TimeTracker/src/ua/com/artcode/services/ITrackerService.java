package ua.com.artcode.services;

import ua.com.artcode.model.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 09.06.2014.
 */
public interface ITrackerService {

    /**
     * Get all tickets of some user without filter.
     *
     **/
    List<Ticket> allTickets();

    /**
     * Find all tickets with filter.
     * For ignoring some search filters, just pass <code>null</code>
     *
     * @param desc query word for search in main and full descriptions
     *
     * @param start date range
     *
     * @param end date range
     *
     * @return List of tickets which were found
     **/
    List<Ticket> allWithFilter(String desc, Date start, Date end);


}
