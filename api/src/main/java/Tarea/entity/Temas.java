package Tarea.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.util.List;

/**
 * Created by esr on 26/10/15.
 */
public class Temas {
    @InjectLinks({})
    private List<Link> links;
    private String id;
    private String Temaid;
    private  String Title;
    private  String Content;


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

    public String getTemaid() {
        return Temaid;
    }

    public void setTemaid(String temaid) {
        Temaid = temaid;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
