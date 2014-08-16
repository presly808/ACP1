package ua.artcode.dao;

import java.util.List;

/**
 * Created by admin on 16.08.2014.
 */
public interface Dao<T> {

    void create(T t);
    T find(int id);
    void delete(int id);
    List<T> findAll();

}
