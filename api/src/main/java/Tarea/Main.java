package Tarea;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Main class.
 *
 */
public class Main {
    // Base URI the Grizzly HTTP server will listen on
    //public static final String BASE_URI = "http://localhost:8080/myapp/";
private static String baseURI;
    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
    public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in Tarea.beeter package
        final ResourceConfig rc = new ResourceConfig().packages("Tarea.beeter");

        // create and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(getBaseURI()), rc);
    }

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nHit enter to stop it...", getBaseURI()));
        System.in.read();
        server.stop();
        server.shutdown();
    }

    public final static String getBaseURI() {
        if (baseURI == null) {
            //Carga atributos definidos en el fichero Tarea.properties dentro del directorio resources
            PropertyResourceBundle prb = (PropertyResourceBundle) ResourceBundle.getBundle("Tarea");
            baseURI = prb.getString("Tarea.context");
        }
        return baseURI;
    }
}

