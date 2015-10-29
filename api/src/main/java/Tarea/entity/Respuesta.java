package Tarea.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.util.List;

/**
 * Created by esr on 26/10/15.
 */
public class Respuesta {
    @InjectLinks({})
    private List<Link> links;
    private String id;
    private String Respid;
    private String content;

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRespid() {
        return Respid;
    }

    public void setRespid(String respid) {
        this.Respid = respid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
