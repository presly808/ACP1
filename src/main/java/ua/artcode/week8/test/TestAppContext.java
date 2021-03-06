package ua.artcode.week8.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 09.08.2014.
 */
public class TestAppContext {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");

        DataContainer dc = ac.getBean("dataContainer",DataContainer.class);
        dc.getStart();
        dc.getMillis();

        System.out.println();


    }
}
