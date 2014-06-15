package ua.artcode.week2.day2.ReflectionFileHelper;

import com.sun.xml.internal.bind.v2.model.core.ClassInfo;

import java.io.FileWriter;

/**
 * Created by vkucheru on 15.06.2014.
 */
public class Saver implements ISaver {
    @Override
    public void save(Object o) {
        ClassInfo classInfo = null;
        String className = classInfo.getClass(o);
        String[] classFields = classInfo.getFieldInfo(o);

        FileWriter fw = new FileWriter("d:/reflection_test");
        fw.write(className+"\n");
        for (String s: classFields) {
            fw.write(s+"\n");
        }
        fw.close();
    }

    @Override
    public Object load() {
        return null;
    }
}
