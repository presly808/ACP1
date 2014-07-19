package ua.artcode.week2.day2;

import ua.artcode.week2.day1.metadata.User;

import java.lang.reflect.*;

/**
 * Created by admin on 15.06.2014.
 */
public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, NoSuchMethodException {
        User u1 = new User("12345", "presly");
        Class cl = u1.getClass();
        User newU = (User) cl.newInstance();
        Constructor cons = cl.getConstructor(String.class, String.class);
        User userFromConst = (User) cons.newInstance("44444", "new login");

        System.out.println(userFromConst);

        Field f1 = cl.getDeclaredField("pass");
        f1.setAccessible(true);
        f1.set(newU, "44444");
        Field f2 = cl.getDeclaredField("login");
        f2.setAccessible(true);
        f2.set(newU, "new login");

        System.out.println(newU);
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
