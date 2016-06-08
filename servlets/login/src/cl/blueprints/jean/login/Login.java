package cl.blueprints.jean.login;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/** This Class is responsible for checking that only the registered users can access.
 * Created by Admin on 08/06/2016.
 */

@WebServlet(name = "login", urlPatterns = "/login")
public class Login implements Servlet{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        if (username==null||password==null)
            servletRequest.getRequestDispatcher("login.html").forward(servletRequest, servletResponse);
        else if ((username.equals("jdeglaire")&&password.equals("jdeglaire")||(username.equals("afarias")&&password.equals("afarias")))){
            servletRequest.getRequestDispatcher("success.html").forward(servletRequest, servletResponse);
        }
        else servletRequest.getRequestDispatcher("login.html").forward(servletRequest, servletResponse);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
