package week2.day2.reflection.ReflectionFileHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vkucheru on 15.06.2014.
 */
public class SaverLoader implements ISaverLoader {
    @Override
    public void save(Object o, String fileName) throws IllegalAccessException, IOException {
        ClassInfo classInfo = new ClassInfo();
        String className = classInfo.getClass(o);
        String[] classFields = classInfo.getFieldInfo(o);

        FileWriter fw = new FileWriter(fileName);
        fw.write(className+"\n");
        for (String s: classFields) {
            fw.write(s+"\n");
        }
        fw.close();
    }

    @Override
    public List<String> load(String fileName) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner( new File(fileName));
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        return list;
    }
}
