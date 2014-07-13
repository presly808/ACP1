package main.java.artcode.week2.day2.reflection;

import java.io.*;

/**
 * Created by amakogon on 15.06.2014.
 */
public class SaverImpl implements ISaver {

    private final static String FILE_PATH = "D:/ArtCode/users.txt";
    private final static String SEPARATOR = "-----";

    @Override
    public void save(Object o) throws IOException {
        IClassInfo classInfo = new ClassInfoImpl();
        try {
            FileWriter writer = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String className = classInfo.getClassName(o);
            String[] fields = classInfo.getFieldInfo(o);
            bufferedWriter.write(className + "\n");
            for (String s : fields) {
                bufferedWriter.write(s + "\n");
            }
            bufferedWriter.write(SEPARATOR + "\n");
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] load() throws IOException {
        FileReader reader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            builder.append("\n" + line);

        }
        String[] users = builder.toString().split(SEPARATOR);
        return users;
    }
}
