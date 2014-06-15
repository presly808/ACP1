package ua.artcode.week2.day2.reflection;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by amakogon on 15.06.2014.
 */
public class SaverImpl implements ISaver {

    private final static String FILE_PATH = "D:/ArtCode/users.txt";

    @Override
    public void save(Object o) {
        IClassInfo classInfo = new ClassInfoImpl();
        try {
            PrintWriter writer = new PrintWriter(FILE_PATH);
            String className = classInfo.getClassName(o);
            String[] fields = classInfo.getFieldInfo(o);
            writer.println(className);
            for (String s : fields) {
                writer.println(s);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] load() {
        return new String[0];
    }
}
