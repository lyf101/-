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
 * Date:2021/3/20 10:05
 * Author:lyf
 */
@WebServlet("/selectProduct")
public class SelectProductServlet extends HttpServlet {
    private IProductDAO productDAO = new ProductDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("utf8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\">" +
                "<title>Title</title></head><body><table border=\"1px\"><tr><td>商品id</td>" +
                "<td>商品名称</td><td>商品分类id</td><td>售价</td><td>供应商</td><td>品牌</td><td>折扣</td>" +
                "<td>成本</td><td>操作</td></tr>\n");
        List<Product> products = productDAO.selectAll();
        for (Product product : products){
            String brand = product.getBrand();
            Double costPrice = product.getCostPrice();
            Double cutoff = product.getCutoff();
            Long dir_id = product.getDir_id();
            Long id = product.getId();
            String productName = product.getProductName();
            Double salePrice = product.getSalePrice();
            String supplier = product.getSupplier();

            out.println("<tr><td>"+id+"</td><td>"+productName+"</td><td>"+dir_id+"</td><td>"
                    +salePrice+"</td><td>"+supplier+"</td><td>"+brand+"</td><td>"+cutoff+"</td>" +
                    "<td>"+costPrice+"</td><td><a href=\"/deleteProduct?id="+id+"\">删除</a><span>|</span>" +
                    "<a href=\"/toUpdateProductView?id="+id+"\">修改</a></td></tr>");

        }
        out.println("</table></body></html>");


    }
}
