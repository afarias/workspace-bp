package cl.blueprints.jean.login;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/** This Filter is responsible for granting or refusing access to the success page.
 * Created by Admin on 10/06/2016.
 */
public class AccessFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String username = request.getParameter("username");

        HttpSession session = request.getSession();

        if (session == null)
            request.getRequestDispatcher("login.html").forward(request, servletResponse);

        if (username == null)
            request.getRequestDispatcher("login.html").forward(request, servletResponse);

        assert session != null;
        if(session.getAttribute(username) == 1)
        {
            request.getRequestDispatcher("success.html").forward(request, servletResponse);
        }

        request.getRequestDispatcher("login.html").forward(request, servletResponse);
        // filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
