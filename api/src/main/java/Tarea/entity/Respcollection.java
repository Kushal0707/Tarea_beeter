package Tarea.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esr on 26/10/15.
 */
public class Respcollection {
    @InjectLinks({})
    private List<Link> links;
    private List<Group> Respuesta = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Group> getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(List<Group> respuesta) {
        Respuesta = respuesta;
    }
}
