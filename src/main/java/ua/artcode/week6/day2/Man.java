package ua.artcode.week6.day2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 18.07.2014.
 */
@Entity
@Table(name = "MANS")
public class Man {

    @Id// must have every entity
    @Column(name = "id_man")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;


    public Man() {
    }

    public Man(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
