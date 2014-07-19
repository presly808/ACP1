package ua.artcode.week5.day1.prop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by admin on 05.07.2014.
 */
public class TestProp {

    public static void main(String[] args) throws IOException {

        java.util.Properties properties = new Properties();
        properties.setProperty("connection.timeout", "10000");
        properties.setProperty("max.user", "12");
        properties.setProperty("server.port", "9090");

        properties.storeToXML(new FileOutputStream("server.xml"), "comment");



    }

    public static void addAll(String...mas){

    }

}
