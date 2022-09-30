package cgrc.parcoursepicuriens.api;

import cgrc.parcoursepicuriens.modele.HeartBeat;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

import java.io.IOException;

public class IndexServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HeartBeat reponse = new HeartBeat("Québec");

        resp.setStatus(HttpStatus.OK_200);
        resp.getWriter().println(JsonParser.parse(reponse));
    }


}
