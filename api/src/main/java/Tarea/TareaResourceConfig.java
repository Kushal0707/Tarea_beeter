package Tarea;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by esr on 24/10/15.
 */
public class TareaResourceConfig extends ResourceConfig{
    public TareaResourceConfig() {
        packages("package Tarea");
    }
}
