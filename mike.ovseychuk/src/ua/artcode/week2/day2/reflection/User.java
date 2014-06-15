package ua.artcode.week2.day2.reflection;

/**
 * Created by mike on 6/15/14.
 */
public class User
{
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private String pass;
    private String login;



    public void doWork()
    {
        System.out.println("I'm doing work");
    }

    private void doPrivateWork()
    {
        System.out.println("do private work");
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private void showParams(String s)
    {
        System.out.print(s + " login " + login + " pass " + pass);
    }

}
