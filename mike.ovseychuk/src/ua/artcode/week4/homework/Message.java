package ua.artcode.week4.homework;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by mike on 7/2/14.
 */
public class Message {

    private String text;
    private String authorName;

    public Message() {
        text = "test";
        authorName = "user";
    }



    public Message(String text, String authorName) {
        this.text = text;
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
