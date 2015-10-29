package Tarea.dao;

import Tarea.entity.*;
import Tarea.entity.Error;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by esr on 29/10/15.
 */
public class GrupoDAOImpl implements GrupoDAO {

    @Override
    public Grupo createGrupo(String userid, String name) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        String id = null;
        try {
            connection = Database.getConnection();
            stmt = connection.prepareStatement(UserDAOQuery.UUID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next())
                id = rs.getString(1);
            else
                throw new SQLException();
            if (id.compareTo("Admin") == 1) {
                stmt = connection.prepareStatement(GrupoDAOQuery.CREATE_Grupo);
                stmt.setString(1, id);
                stmt.setString(2, name);
                stmt.executeUpdate();
            }
            //  else(Error)
        } catch (SQLException e) {
            throw e;
        } finally {
            if (stmt != null) stmt.close();
            if (connection != null) {
                connection.setAutoCommit(true);
                connection.close();
            }

        }

        return grupoby(id) ;
    }
    @Override
    public Grupo grupoby(String id) throws SQLException {
        Grupo gp = null;

        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            connection = Database.getConnection();

            stmt = connection.prepareStatement(GrupoDAOQuery.GET_Grupo_BY_ID);
            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                gp = new Grupo();
                gp.setId(rs.getString("id"));
                gp.setName(rs.getString("name"));

            }
        }catch(SQLException e)
            {
                throw e;
            }finally{
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            }
            return gp;
        }
        @Override
    public Grupo entrarenGrupo(String loginid, String name ) throws SQLException {
            Connection connection = null;
            PreparedStatement stmt = null;

            try {
                connection = Database.getConnection();
                stmt = connection.prepareStatement(UserDAOQuery.UUID);
                ResultSet rs = stmt.executeQuery();
                if (rs.next())
                    id = rs.getString(1);
                else
                    throw new SQLException();
                if (id.compareTo("Admin") == 1) {

    }

    @Override
    public boolean deleteGrupo(String id, String name) throws SQLException {
        return false;
    }
}
