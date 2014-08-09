package ua.artcode.week8.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 09.08.2014.
 */
public class TestAppContext {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        DataHandler dataHandler = (DataHandler) ac.getBean("testBean");
        System.out.println(dataHandler);

    }
}
