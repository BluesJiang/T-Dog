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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String keyword ;
        keyword = req.getParameter("keyword");
        if (keyword != null) {
            System.out.println(keyword);

            ArrayList<Item> content =  Item.findItemWithName(keyword);
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            req.setAttribute("result", content);
            rd.forward(req, resp);
        }
        String id = req.getParameter("id");
        if (id != null) {
            System.out.println(id);
            Item res = Item.findItemWithID(id);
            RequestDispatcher rd = req.getRequestDispatcher("");
            req.setAttribute("item", res);
            rd.forward(req, resp);
        }

    }
}
