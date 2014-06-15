package ua.artcode.week2.day2.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mike on 6/15/14.
 */
public class MyReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        User u = new User("Mike", 22);
        showInfo(u);
    }

    public static void showInfo(Object o) throws IllegalAccessException, InvocationTargetException {
        Class c1 = o.getClass();
        showFields(c1.getDeclaredFields(), o);
        showMethods(c1.getDeclaredMethods(), o);
    }

    public static void showFields(Field[] fields, Object o) throws IllegalAccessException {
        for (Field f : fields){
            f.setAccessible(true);
            Object value = f.get(o);
            System.out.println(value);
        }
    }

    public static void showMethods(Method[] methods, Object o) throws InvocationTargetException, IllegalAccessException {
        for (Method m : methods)    {
            if("showParams".equals(m.getName())) {
                m.setAccessible(true);
                m.invoke(o, "Some");
            }
        }

    }


}
