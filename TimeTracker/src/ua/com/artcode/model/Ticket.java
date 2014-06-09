package ua.com.artcode.model;

import ua.com.artcode.utils.DateUtil;

import java.util.Date;

/**
 * Created by admin on 09.06.2014.
 */
public class Ticket {

    private long id;
    private String title;
    private String description;
    private Date start;
    private Date end;

    private User user;

    public Ticket() {
    }

    public Ticket(String fullDesc, String title, User user) {
        this.description = fullDesc;
        this.title = title;
        this.user = user;
    }

    public Ticket(User user, Date start, Date end, String fullDesc, String title) {
        this.user = user;
        this.start = start;
        this.end = end;
        this.description = fullDesc;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {

        return "ua.com.artcode.model.Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", start=" + DateUtil.format(start) +
                ", end=" + DateUtil.format(end) +
                ", user=" + user +
                '}';
    }
}
