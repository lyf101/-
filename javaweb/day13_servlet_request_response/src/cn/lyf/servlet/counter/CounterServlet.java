package cn.lyf.servlet.counter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Date:2021/3/20 18:45
 * Author:lyf
 */
@WebServlet("/counter")
public class CounterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String num1str = req.getParameter("num1");
        if (num1str==null||num1str.equals("")){
            num1str="0";
        }
        String num2str = req.getParameter("num2");
        if (num2str==null||num2str.equals("")){
            num2str="0";
        }

        Double num1 = Double.valueOf(num1str);
        Double num2 = Double.valueOf(num2str);

        String symbol = req.getParameter("symbol");
        Double result = 0.0;
        switch (symbol){
            case "+":result = num1+num2;break;
            case "-":result = num1-num2;break;
            case "*":result = num1*num2;break;
            case "/":result = num1/num2;break;
        }


        req.setAttribute("num1",num1);
        req.setAttribute("num2",num2);
        req.setAttribute("symbol",symbol);
        req.setAttribute("result",result);


       /* //重定向
        resp.sendRedirect("/counterView");*/

        //转发
        req.getRequestDispatcher("/counterView").forward(req,resp);
    }
}
