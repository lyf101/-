package cn.lyf.servlet;

import cn.lyf.dao.IProductDAO;
import cn.lyf.dao.impl.ProductDAOImpl;
import cn.lyf.domain.Product;
import sun.rmi.runtime.Log;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Date:2021/3/20 16:52
 * Author:lyf
 */
@WebServlet("/toUpdateProductView")
public class ToUpdateProductViewServlet extends HttpServlet {

    private IProductDAO productDAO = new ProductDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String idStr = req.getParameter("id");
        Long id = Long.valueOf(idStr);
        Product product = productDAO.selectById(id);
        req.setAttribute("product",product);
        req.getRequestDispatcher("/WEB-INF/update.jsp").forward(req,resp);

    }
}
