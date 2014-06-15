package ua.artcode.week2.day1.metadata;

/**
 * Created by mike on 6/14/14.
 */
@MyAnnotation(login = "vasya", pass = 22122)
public class User {


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
