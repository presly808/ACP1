package ua.artcode.week2.day2;

import ua.artcode.week2.day1.metadata.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by admin on 15.06.2014.
 */
public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        User u1 = new User("12345", "presly");
        showInfo(u1);
    }

    public static void showInfo(Object o) throws IllegalAccessException, InvocationTargetException {
        Class cl = o.getClass();
        showFieldsValues(cl.getDeclaredFields(), o);
        showMethods(cl.getDeclaredMethods(), o);
    }

    public static void showFieldsValues(Field[] fields, Object o) throws IllegalAccessException {
        for(Field f : fields) {
            f.setAccessible(true);
            Object value = f.get(o);
            System.out.println(value);
        }

    }

    public static void showMethods(Method[] methods, Object o) throws InvocationTargetException, IllegalAccessException {

        for(Method m : methods){
            if("showParams".equals(m.getName())){
                m.setAccessible(true);
                m.invoke(o, "Some");
            }

        }

    }
}
