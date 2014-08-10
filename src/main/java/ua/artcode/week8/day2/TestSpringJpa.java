package ua.artcode.week8.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManagerFactory;

/**
 * Created by admin on 10.08.2014.
 */
public class TestSpringJpa {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:ua.artcode.week8/application-context.xml");
        EntityManagerFactory factory = (EntityManagerFactory) ac.getBean("entityManagerFactory");
        factory.isOpen();
    }
}
