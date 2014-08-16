package ua.artcode.controller;

import ua.artcode.dao.ProductDao;
import ua.artcode.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 16.08.2014.
 */
public class ProductServletController extends HttpServlet {

    private ProductDao productDao = new ProductDao();

    private static final String PARAM_ID = "id";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String param = req.getParameter(PARAM_ID);

        Product product = productDao.find(Integer.parseInt(param));

        req.setAttribute("product1", product);

        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/pages/product.jsp");
        rd.forward(req,resp);


    }
}
