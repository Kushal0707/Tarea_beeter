package Tarea.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by esr on 26/10/15.
 */
public class Groupcollection {
    @InjectLinks({})
    private List<Link> links;
     private List<Group> Grupo = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }



    public List<Group> getGrupo() {
        return Grupo;
    }

    public void setGrupo(List<Group> Grupo){
        this.Grupo = Grupo;
    }
}
