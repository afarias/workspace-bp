package cl.blueprints.jean.attributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * This method is responsible for adding an attribute to the user session
 * Created by Admin on 09/06/2016.
 */
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String value = req.getParameter("value");
        HttpSession session = req.getSession(true);
        session.setAttribute(name, value);

        req.getRequestDispatcher("manager.jsp").forward(req, resp);

    }

}
