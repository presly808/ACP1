package ua.artcode.week8.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 09.08.2014.
 */
public class DataHandler {

    private String host;
    private int port;

    public DataHandler() {
    }

    public DataHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DataHandler{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }



}
