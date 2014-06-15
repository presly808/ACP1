package ua.artcode.week2.day2.ReflectionFileHelper;

import java.io.IOException;

/**
 * Created by mike on 6/15/14.
 */
public interface ISaver {

    void save (Object o) throws IOException, IllegalAccessException;
    Object load();

}
