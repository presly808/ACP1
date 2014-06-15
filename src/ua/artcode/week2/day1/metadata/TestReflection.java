package ua.artcode.week2.day1.metadata;

import java.lang.reflect.Field;

/**
 * Created by admin on 14.06.2014.
 */
public class TestReflection {
    public static void main(String[] args) throws IllegalAccessException {
        User u = new User("Igor", "pass");
        Class userClass = u.getClass();

        Field[] fields = userClass.getDeclaredFields();
        System.out.println(fields.length);
        for(Field f : fields) {
            f.setAccessible(true);
            f.set(u , "new");
            System.out.println(f.getName());
        }

        System.out.println(u);

    }

}
