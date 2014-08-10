package ua.artcode.week8.rmi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 10.08.2014.
 */
public class RunClient {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("rmi/client-app-context.xml");
        RemoteService rc = (RemoteService) ac.getBean("remoteService");
        String response = rc.getMessage();
        System.out.println(response);

    }
}
