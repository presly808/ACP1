package ua.artcode.week7.day1.jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by admin on 19.07.2014.
 */
@Entity
@Table(name = "Authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    public Author() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
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

    public List<Book> getBookList() {
        return books;
    }

    public void setBookList(List<Book> bookList) {
        this.books = bookList;
    }
}
