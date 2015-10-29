package Tarea.dao;

import Tarea.entity.Grupo;
import Tarea.entity.Groupcollection;

import java.sql.SQLException;

/**
 * Created by esr on 29/10/15.
 */
public interface GrupoDAO {
public Grupo createGrupo(String userid, String name) throws SQLException;
    public Grupo entrarenGrupo(String userid) throws SQLException;
    public Grupo grupoby(String id) throws SQLException;
    public boolean deleteGrupo(String id, String username) throws SQLException;


}
