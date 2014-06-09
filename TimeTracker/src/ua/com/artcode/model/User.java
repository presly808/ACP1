package ua.com.artcode.model;

import ua.com.artcode.services.ITrackerService;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 09.06.2014.
 */
public class User implements ITrackerService {

    private long id;
    private String fullname;
    private int level;
    private List<Ticket> activeTickets;
    private List<Ticket> tickets;
    private Group group;
    private long minutesAmount;


    public User() {
    }

    public User(String fullname, Group group) {
        this.fullname = fullname;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public long getMinutesAmount() {
        return minutesAmount;
    }

    public void setMinutesAmount(long minutesAmount) {
        this.minutesAmount = minutesAmount;
    }

    public List<Ticket> getActiveTickets() {
        return activeTickets;
    }

    public void setActiveTickets(List<Ticket> activeTickets) {
        this.activeTickets = activeTickets;
    }

    @Override
    public List<Ticket> allTickets() {
        return tickets;
    }

    //TODO: finish method
    @Override
    public List<Ticket> allWithFilter(String query, Date start, Date end) {
        return null;
    }

    @Override
    public String toString() {
        return "ua.com.artcode.model.User{" +
                "minutesAmount=" + minutesAmount +
                ", group=" + group +
                ", level=" + level +
                ", fullname='" + fullname + '\'' +
                ", id=" + id +
                '}';
    }

}
