package week2.day2.reflection.ReflectionFileHelper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Created by mike on 6/15/14.
 */
public interface ISaver {

    void save(Object o, String fileName) throws IOException, IllegalAccessException;
    List<String> load(String fileName) throws FileNotFoundException;

}
