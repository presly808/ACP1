package ua.artcode.week2.day1.annotation;

/**
 * Created by Тарнавський Сергій on 14.06.14.
 */
@MyAnnotation(name = "Vasia", age = 24)
public class User {

    private String login;
    private String pass;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }
}
