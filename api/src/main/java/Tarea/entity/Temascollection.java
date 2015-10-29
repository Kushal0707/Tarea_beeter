package Tarea.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esr on 26/10/15.
 */
public class Temascollection {
    @InjectLinks({})
    private List<Link> links;
    private List<Group> Temas = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Group> getTemas() {
        return Temas;
    }

    public void setTemas(List<Group> temas) {
        Temas = temas;
    }
}
