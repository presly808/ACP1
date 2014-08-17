package ua.artcode.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by admin on 17.08.2014.
 */
public class InfoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("INIT InfoFilter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("***********************");
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getProtocol());
        System.out.println(request.getLocale());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }

}
