package week2.day2.reflection;

import java.lang.reflect.Field;

/**
 * Created by vkucheru on 15.06.2014.
 */
public class Ref {
    public static void showInfoRef (Object o) throws IllegalAccessException {
        System.out.println(o.getClass().getName());
        Class cl = o.getClass();
        //Field[] f = cl.getDeclaredFields();
        for (Field i: cl.getDeclaredFields()) {
            i.setAccessible(true);
            System.out.println(i.get(o).toString());
        }
    }
}
