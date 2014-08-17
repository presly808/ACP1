package ua.artcode.controller;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
/*
* Extends from this class when use @Autowared in child
* */
public class SpringInjectionProcessServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, getServletContext());
    }
}
