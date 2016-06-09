package cl.blueprints.jean.attributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Admin on 09/06/2016.
 */
public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
// TODO : à compléter pour récupérer le paramètre avec le nom de l'attribut dans la session http: puis retirer l'attribute désiré et renvoyer vers Attributes
    }
}
