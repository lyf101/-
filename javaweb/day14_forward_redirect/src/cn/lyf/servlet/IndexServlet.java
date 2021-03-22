package cn.lyf.servlet;

import cn.lyf.dao.IProductDAO;
import cn.lyf.dao.impl.ProductDAOImpl;
import cn.lyf.domain.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Date:2021/3/22 16:55
 * Author:lyf
 */
@WebServlet("/indexProduct")
public class IndexServlet extends HttpServlet {
    private IProductDAO productDAO = new ProductDAOImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productDAO.selectAll();
        req.setAttribute("products",products);
        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req,resp);
    }
}
