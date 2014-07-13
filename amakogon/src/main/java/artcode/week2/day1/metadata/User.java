package main.java.artcode.week2.day1.metadata;

/**
 * Created by amakogon on 14.06.2014.
 */
public class User {
    @MyAnnotation(name = "Vasia", age = 24)
    private String login;

    @MyAnnotation
    private String pass;


    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
