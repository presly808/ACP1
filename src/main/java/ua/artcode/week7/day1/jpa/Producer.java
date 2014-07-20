package ua.artcode.week7.day1.jpa;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 20.07.2014.
 */
@Entity
@Table(name = "Producers")
public class Producer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "producer", cascade = CascadeType.PERSIST)
    private Set<Author> authors = new HashSet<>();

    public Producer() {
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
