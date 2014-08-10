package ua.artcode.week8.rmi.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 10.08.2014.
 */
public class RunServer {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("rmi/server-app-context.xml");
        System.out.println("Server start");

    }
}
