package ua.artcode.week2.day2.reflection;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by amakogon on 15.06.2014.
 */
public interface ISaver {
    void save (Object o) throws IOException;
    String[] load() throws IOException;
}
