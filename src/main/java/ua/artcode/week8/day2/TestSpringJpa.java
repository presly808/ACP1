package ua.artcode.week8.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.artcode.week7.day1.dao.UserDAO;
import ua.artcode.week7.day1.dao.UserDAOImpl;
import ua.artcode.week7.day1.jpa.Author;

import javax.persistence.EntityManagerFactory;

/**
 * Created by admin on 10.08.2014.
 */
public class TestSpringJpa {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:week8_orm/application-context.xml");
        UserDAO userDAO = (UserDAO) ac.getBean("userDAOImpl");

        Author a = new Author();
        a.setName("Kostia");
        userDAO.save(a);


    }
}
