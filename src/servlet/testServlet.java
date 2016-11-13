package servlet;

/**
 * T-Dog
 * Created by Blues on 2016/11/13.
 */

import javax.servlet.*;
import javax.servlet.http.*;

public class testServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("hello world");
    }
}
