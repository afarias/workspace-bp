package cl.blueprints.jean.lifecycle;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by andres on 6/6/16.
 */
public class JeanServletLifeCycle implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("JEAN A DEMARRE!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        PrintWriter writer = servletResponse.getWriter();

        writer.println("<HTML>");
        writer.println("<HEADER><TITLE>Ma page</TITLE></HEADER>");
        writer.println("<BODY><H1>Je m'appele Jean!</H1></BODY>");
        writer.println("</HTML>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
