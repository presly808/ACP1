package ua.artcode.week2.day2.reflection;

import ua.artcode.week2.day1.metadata.User;

/**
 * Created by amakogon on 15.06.2014.
 */
public class Main {
    public static void main(String[] args) {
        ISaver saver = new SaverImpl();
        User user1 = new User("Artem","Pass");
        saver.save(user1);
    }
}
