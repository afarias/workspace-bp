package cl.blueprints.jean.attributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**This method is responsible for removing attributes in the user session
 * Created by Admin on 09/06/2016.
 */
public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        req.getParameter("todelete");
        session.removeAttribute(req.getParameter("todelete"));
        req.getRequestDispatcher("attributes").forward(req, resp);
    }
}
