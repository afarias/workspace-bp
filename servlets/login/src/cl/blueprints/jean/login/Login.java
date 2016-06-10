package cl.blueprints.jean.login;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * This Class is responsible for checking that only the registered users can access.
 * Created by Admin on 08/06/2016.
 */

@WebServlet(name = "login", urlPatterns = "/login")
public class Login implements Servlet {

    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession(true);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        session.setAttribute(username, 0);

        if (username == null || password == null)
            request.getRequestDispatcher("login.html").forward(request, servletResponse);
        else {
            if ((username.equals("jdeglaire") && password.equals("jdeglaire") || (username.equals("afarias") && password.equals("afarias")))) {
                session.setAttribute(username, 1);
                request.getRequestDispatcher("success.html").forward(request, servletResponse);
            } else request.getRequestDispatcher("login.html").forward(request, servletResponse);
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
