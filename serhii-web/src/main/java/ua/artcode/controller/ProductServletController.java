package ua.artcode.controller;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
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
public class ProductServletController extends SpringInjectionProcessServlet {

    @Autowired
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    private static final String PARAM_ID = "id";
    private static final String PRODUCT_PAGE = "WEB-INF/pages/product.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String param = req.getParameter(PARAM_ID);
        Product product = productDao.find(Integer.parseInt(param));
        req.setAttribute("product", product);
        RequestDispatcher rd = req.getRequestDispatcher(PRODUCT_PAGE);

        rd.forward(req,resp);

    }
}
