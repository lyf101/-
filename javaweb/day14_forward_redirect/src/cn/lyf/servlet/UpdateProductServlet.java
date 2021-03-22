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
import java.util.Map;

/**
 * Date:2021/3/20 17:15
 * Author:lyf
 */
@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet {
    private IProductDAO productDAO = new ProductDAOImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf8");

        Long id = Long.valueOf(req.getParameter("id"));
        String productName = req.getParameter("productName");
        Long dir_id = Long.valueOf(req.getParameter("dir_id"));
        Double salePrice = Double.valueOf(req.getParameter("salePrice"));
        String supplier = req.getParameter("supplier");
        String brand = req.getParameter("brand");
        Double cutoff = Double.valueOf(req.getParameter("cutoff"));
        Double costPrice = Double.valueOf(req.getParameter("costPrice"));

        Product product = new Product(id,productName,dir_id,salePrice,supplier,brand,cutoff,costPrice);

        productDAO.update(product);
        //重定向
        resp.sendRedirect("/indexProduct");


    }
}
