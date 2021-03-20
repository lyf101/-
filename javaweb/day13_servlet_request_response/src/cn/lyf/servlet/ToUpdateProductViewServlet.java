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
        resp.setCharacterEncoding("utf8");
        PrintWriter out = resp.getWriter();

        String idStr = req.getParameter("id");
        Long id = Long.valueOf(idStr);
        Product product = productDAO.selectById(id);
        out.println("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\">" +
                "<title>Title</title></head><body><form action=\"/updateProduct\" method=\"post\">" +
                "<table border=\"1px\">\n");
        String supplier = product.getSupplier();
        Double salePrice = product.getSalePrice();
        String productName = product.getProductName();
        Long dir_id = product.getDir_id();
        Double cutoff = product.getCutoff();
        Double costPrice = product.getCostPrice();
        String brand = product.getBrand();

        out.println("<tr><td>商品id</td><td><input type=\"text\" name=\"id\" value=\""+id+"\" readonly/></td></tr>\n" +
                "    <tr><td>商品名称</td><td><input type=\"text\" value=\""+productName+"\" name=\"productName\"/></td></tr>\n" +
                "    <tr><td>商品分类id</td><td><input type=\"text\" value=\""+dir_id+"\" name=\"dir_id\"/></td></tr>\n" +
                "    <tr><td>售价</td><td><input type=\"text\" value=\""+salePrice+"\" name=\"salePrice\"/></td></tr>\n" +
                "    <tr><td>供应商</td><td><input type=\"text\" value=\""+supplier+"\" name=\"supplier\"/></td></tr>\n" +
                "    <tr><td>品牌</td><td><input type=\"text\" value=\""+brand+"\" name=\"brand\"/></td></tr>\n" +
                "    <tr><td>折扣</td><td><input type=\"text\" value=\""+cutoff+"\" name=\"cutoff\"/></td></tr>\n" +
                "    <tr><td>成本</td><td><input type=\"text\" value=\""+costPrice+"\" name=\"costPrice\"/></td></tr>\n" +
                "    <tr><td colspan=\"2\"><input type=\"submit\" value=\"修改\"/></td></tr>");


    }
}
