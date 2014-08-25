package ua.artcode.controller;

import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by admin on 17.08.2014.
 */
@WebServlet(urlPatterns = {"/count"})
public class VisitCounterController extends HttpServlet {

    public static final String COUNT = "count";



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session= req.getSession();

        Cookie[] cookies = req.getCookies();

        Integer val = 0;
        if(cookies == null || cookies.length < 1){
                resp.addCookie(new Cookie(COUNT, "1"));
                val = 1;
        } else {
            for (Cookie c : cookies) {
                if(c.getName().equals(COUNT)){
                    val = Integer.parseInt(c.getValue());
                    val++;
                    c.setValue(val.toString());
                    resp.addCookie(c);
                }
            }
        }


        PrintWriter pw = resp.getWriter();
        pw.println("Visits : " + val);
        pw.println("Date : " +  new Date());
        pw.close();


    }
}
