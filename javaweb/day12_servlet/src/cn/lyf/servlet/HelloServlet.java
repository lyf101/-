package cn.lyf.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Date:2021/3/19 11:16
 * Author:lyf
 */
@WebServlet(value = "/hello",loadOnStartup = 1)
public class HelloServlet implements Servlet {

    public HelloServlet(){
        System.out.println("加载完毕");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet.init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet.destroy");

    }
}
