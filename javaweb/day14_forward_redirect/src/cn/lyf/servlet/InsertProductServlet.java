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

/**
 * Date:2021/3/22 8:50
 * Author:lyf
 */
@WebServlet("/insertProduct")
public class InsertProductServlet extends HttpServlet {
    private IProductDAO productDAO = new ProductDAOImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String productName = req.getParameter("productName");
        Long dir_id = Long.valueOf(req.getParameter("dir_id"));
        Double salePrice = Double.valueOf(req.getParameter("salePrice"));
        String supplier = req.getParameter("supplier");
        String brand = req.getParameter("brand");
        Double cutoff = Double.valueOf(req.getParameter("cutoff"));
        Double costPrice = Double.valueOf(req.getParameter("costPrice"));

        Product product = new Product(null,productName,dir_id,salePrice,supplier,brand,cutoff,costPrice);

        productDAO.insert(product);

        resp.sendRedirect("/indexProduct");

    }
}
