package ua.artcode.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 17.08.2014.
 */
@WebServlet(urlPatterns = {"/count"})
public class VisitCounterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies){
            System.out.println("key : " + c.getName());
            System.out.println("value : " + c.getValue());
        }
        resp.addCookie(new Cookie("server-coocke", "hello vasia"));

    }
}
