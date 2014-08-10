package ua.artcode.week7.day1.dao;

import ua.artcode.week7.day1.jpa.Author;

import java.util.List;

/**
 * Created by admin on 10.08.2014.
 */
public interface UserDAO {

    void save(Author author);

    void remove(Long id);

    List<Author> all();

}
