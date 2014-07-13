package ua.artcode.week2.day2.reflect;

/**
 * Created by admin on 15.06.2014.
 */
public interface ISerializer {

    void save(Object o);

    Object load();


}
