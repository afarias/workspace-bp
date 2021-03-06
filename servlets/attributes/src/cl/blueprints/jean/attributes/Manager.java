package cl.blueprints.jean.attributes;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

/** This method is responsible for showing all the saved attributes
 * Created by Admin on 08/06/2016.
 */

public class Manager extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>");
        writer.println(" <meta charset=\"UTF-8\">");
        writer.println(" <title>Attribute Manager</title>");
        writer.println("<title>Attribute Manager</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Add Parameter</h1>");
        writer.println("<form action=\"add\" method=\"get\">");
        writer.println("    Name :");
        writer.println("    <input type=\"text\" name=\"name\">");
        writer.println("    <br>");
        writer.println("    Value :");
        writer.println("    <input type=\"text\" name=\"value\">");
        writer.println("    <br>");
        writer.println("    <button type=\"submit\">Add</button>");
        writer.println("</form>");

        writer.println("<table border=\"1\">");
        writer.println("<tr>");
        writer.println("<td>NAME</td>");
        writer.println("<td>VALUE</td>");
        writer.println("</tr>");

        Enumeration<String> attributeNames = session.getAttributeNames();
        while(attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();

            writer.println("<tr>");
            writer.println("<td>"+attributeName+"</td>");
            writer.println("<td>"+session.getAttribute(attributeName)+"</td>");
            writer.println("<td>");
            writer.println("<form action=\"delete\" method=\"get\">");
            writer.println("<input type=\"hidden\" name=\"todelete\" value=\""+attributeName+"\">");
            writer.println("<button type=\"submit\">Delete</button>");
            writer.println("</form>");
            writer.println("</td>");
            writer.println("</tr>");
        }

        writer.println("</table>");


        writer.println("</body>");
        writer.println("</html>");

    }

}
