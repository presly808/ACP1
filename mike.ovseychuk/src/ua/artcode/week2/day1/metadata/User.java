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

    public User() {
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
