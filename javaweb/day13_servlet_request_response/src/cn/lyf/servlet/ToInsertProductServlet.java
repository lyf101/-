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
import java.io.PrintWriter;
import java.util.List;

/**
 * Date:2021/3/22 8:41
 * Author:lyf
 */
@WebServlet("/insertProductView")
public class ToInsertProductServlet extends HttpServlet {
    private IProductDAO productDAO = new ProductDAOImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf8");
        PrintWriter out = resp.getWriter();


        out.println("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\">" +
                "<title>Title</title></head><body><form action=\"/insertProduct\" method=\"post\">" +
                "<table border=\"1px\">\n");

        out.println(
                "    <tr><td>商品名称</td><td><input type=\"text\"  name=\"productName\"/></td></tr>\n" +
                "    <tr><td>商品分类id</td><td><input type=\"text\"  name=\"dir_id\"/></td></tr>\n" +
                "    <tr><td>售价</td><td><input type=\"text\"  name=\"salePrice\"/></td></tr>\n" +
                "    <tr><td>供应商</td><td><input type=\"text\"  name=\"supplier\"/></td></tr>\n" +
                "    <tr><td>品牌</td><td><input type=\"text\"  name=\"brand\"/></td></tr>\n" +
                "    <tr><td>折扣</td><td><input type=\"text\"  name=\"cutoff\"/></td></tr>\n" +
                "    <tr><td>成本</td><td><input type=\"text\"  name=\"costPrice\"/></td></tr>\n" +
                "    <tr><td colspan=\"2\"><input type=\"submit\" value=\"修改\"/></td></tr>");


    }
}
