package servlet;

/**
 * T-Dog
 * Created by Blues on 2016/11/14.
 */

import DAClass.ItemDA;
import PDClass.Item;

import java.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class FindItemList extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("testing");
        ItemDA.init();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String keyword ;
        keyword = req.getParameter("keyword");
        System.out.println(keyword);

        ArrayList<Item> content =  Item.findItemWithName(keyword);

//        PrintWriter output = res.getWriter();
//        res.setContentType("application/json");
//        output.print("[true]");
//        output.close();
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        req.setAttribute("result", content);
        rd.forward(req, res);
    }
}
