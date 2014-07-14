package ua.artcode.week5.day1.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by mike on 7/5/14.
 */
public class TestProp {

    public static void main(String[] args) throws IOException {

        java.util.Properties properties = new Properties();

        properties.setProperty("connection.timeout", "10000");
        properties.setProperty("max.value", "12");
        properties.setProperty("server.port", "9090");

        properties.store(new FileOutputStream("/home/mike/server.properties"), "first storing");

        properties.storeToXML(new FileOutputStream("properties.xml"), "my comment in xml");

    }

}
