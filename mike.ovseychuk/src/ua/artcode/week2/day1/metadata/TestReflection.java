package ua.artcode.week2.day1.metadata;

import java.lang.reflect.Field;

/**
 * Created by mike on 6/14/14.
 */
public class TestReflection {


    public static void main(String[] args) throws IllegalArgumentException{

        User u = new User("Nick", 23);

        Class userClass = u.getClass();

        Field[] fields = userClass.getDeclaredFields();

        for (Field f : fields)
        {
            f.setAccessible(true);
            //f.set(u, "new");
            System.out.println(f.getName());
        }

        System.out.println(userClass.getDeclaredFields());

    }
}
