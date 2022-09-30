package cgrc.parcoursepicuriens;

import cgrc.parcoursepicuriens.api.IndexServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Parcours epicuriens v1.0.0");
        Server server = new Server(8080);
        ServletContextHandler servletContextHandler = new ServletContextHandler(server,"/");
        servletContextHandler.addServlet(IndexServlet.class,"/heartbeat");
        server.start();
    }
}