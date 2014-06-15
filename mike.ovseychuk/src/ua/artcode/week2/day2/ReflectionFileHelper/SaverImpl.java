package ua.artcode.week2.day2.ReflectionFileHelper;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by amakogon on 15.06.2014.
 */
public class SaverImpl implements ISaver {
    @Override
    public void save(Object o) {
        IClassInfo classInfo = new ClassInfoImpl();
        try {
            PrintWriter writer = new PrintWriter("D:/ArtCode/users.txt");
           String className = classInfo.getClass(o);
            String[] fields = classInfo.getFieldInfo(o);
            writer.println(className);
            for(String s : fields){
                writer.println(s);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String[] load() {
        return null;
    }
}
