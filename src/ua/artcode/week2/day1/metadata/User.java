package ua.artcode.week2.day1.metadata;

/**
 * Created by admin on 14.06.2014.
 */

@MyAnnotation(login = "Serhii", pass = 22)
public class User {

    private String login;
    private String pass;

    public User(String pass, String login) {
        this.pass = pass;
        this.login = login;
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

    public void showParams(String word){
        System.out.println(word);
    }
}
