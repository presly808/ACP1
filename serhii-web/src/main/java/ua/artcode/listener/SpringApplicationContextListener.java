package ua.artcode.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by admin on 17.08.2014.
 */
//this class was replaced by spring class org.springframework.web.context.ContextLoaderListener (see web.xml)
public class SpringApplicationContextListener implements ServletContextListener {

    private ApplicationContext applicationContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("*********************************");
        System.out.println("Init spring context");
        String path = sce.getServletContext().getInitParameter("spring-context");
        applicationContext = new ClassPathXmlApplicationContext(path);
        sce.getServletContext().setAttribute("spring-context", applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        applicationContext = null;
    }
}
