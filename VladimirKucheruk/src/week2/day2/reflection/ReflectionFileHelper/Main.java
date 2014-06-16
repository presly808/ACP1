package week2.day2.reflection.ReflectionFileHelper;

import week2.day2.reflection.User;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vkucheru on 15.06.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        User user = new User();
        user.setName("Vova");
        user.setAge(25);
        System.out.println("Обьект перед сериализацией ================= "+user);
        Saver saver = new Saver();
        saver.save(user, "d:/reflation_test.txt");
        List<String> list = new ArrayList<String>();
        list = saver.load("d:/reflation_test.txt");
        String className = list.get(0).toString();
        list.remove(className);
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        for (String s : list) {
            SetField.set(obj, s);
        }
        System.out.println("Обьект после востановления рефлексией ====== "+obj);
    }
}


