package cn.lyf.servlet.counter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Date:2021/3/20 19:12
 * Author:lyf
 */
@WebServlet("/counterView")
public class CounterViewServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        Double num1 = (Double)req.getAttribute("num1");
        Double num2 = (Double)req.getAttribute("num2");
        Double result = (Double)req.getAttribute("result");
        String symbol =(String) req.getAttribute("symbol");


        writer.println("<html lang=\"en\"><head><meta charset=\"UTF-8\"><title>Title</title>" +
                "</head><body><form action=\"/counter\"method=\"post\">" +
                "<input type=\"text\" name=\"num1\" value=\""+num1+"\"/><select name=\"symbol\" >\n");
            switch (symbol){
                case "+":{writer.println("<option value=\"+\" selected>+</option>\n" +
                        "        <option value=\"-\">-</option>\n" +
                        "        <option value=\"*\">*</option>\n" +
                        "        <option value=\"/\">/</option>");break;}
                case "-":{writer.println("<option value=\"+\">+</option>\n" +
                        "        <option value=\"-\"  selected>-</option>\n" +
                        "        <option value=\"*\">*</option>\n" +
                        "        <option value=\"/\">/</option>");break;}
                case "*":{writer.println("<option value=\"+\">+</option>\n" +
                        "        <option value=\"-\">-</option>\n" +
                        "        <option value=\"*\"  selected>*</option>\n" +
                        "        <option value=\"/\">/</option>");break;}
                case "/":{writer.println("<option value=\"+\">+</option>\n" +
                        "        <option value=\"-\">-</option>\n" +
                        "        <option value=\"*\">*</option>\n" +
                        "        <option value=\"/\"  selected>/</option>");break;}
            }


        writer.println("</select><input type=\"text\" name=\"num2\" value=\""+num2+"\"/><input type=\"submit\" " +
                "value=\"=\"/><input type=\"text\" name=\"result\" value=\""+result+"\" readonly/>" +
                "</form></body></html>");
    }
}
