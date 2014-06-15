package week2.day1.proxy.metadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by vkucheru on 14.06.2014.
 */

@MyAnnotation(login="Admin", pass = "25")
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
}
