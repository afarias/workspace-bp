package cl.blueprints.jean.math;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sum", urlPatterns = "/sum")
public class Additioner implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String op1 = servletRequest.getParameter("op1");
        String op2 = servletRequest.getParameter("op2");

        int operator1 = Integer.parseInt(op1);
        int operator2 = Integer.parseInt(op2);


        PrintWriter writer = servletResponse.getWriter();

        writer.println("<HTML>");
        writer.println("<HEADER><TITLE>Ma page</TITLE></HEADER>");
        writer.println("<BODY><H1>"+op1+"+"+op2+"="+ (operator1+operator2) +"</H1></BODY>");
        writer.println("</HTML>");

        // servletRequest.getRequestDispatcher("sucess.html").forward(servletRequest, servletResponse);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
