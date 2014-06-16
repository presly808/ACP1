package ua.artcode.week2.day2.reflection;

import ua.artcode.week2.day1.metadata.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by amakogon on 15.06.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        ISaver saver = new SaverImpl();
        User user1 = new User("Artem", "Pass");
        User user2 = new User("Sergio", "Password");
//        saver.save(user1);
//        saver.save(user2);


        String[] allUsers = saver.load();

        IReflectObject reflectObject = new ReflectObjectImpl();

        List<String[]> objectData = reflectObject.getObjectData(allUsers);
        for(int i = 0; i < objectData.size(); i++){
            User clone = (User) reflectObject.instantiate(objectData.get(i));
            reflectObject.setFields(objectData.get(i), clone);
            System.out.println(clone);
        }
    }
}
