package ua.com.artcode.model;

/**
 * Created by admin on 09.06.2014.
 */
public class Company {

    private long id;
    private String name;

    public Company() {
    }

    public Company(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ua.com.artcode.model.Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
