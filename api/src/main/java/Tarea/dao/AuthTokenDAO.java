package Tarea.dao;

import Tarea.auth.UserInfo;
import Tarea.entity.AuthToken;

import java.sql.SQLException;

/**
 * Created by esr on 29/10/15.
 */
public interface AuthTokenDAO {
    public UserInfo getUserByAuthToken(String token) throws SQLException;
    public AuthToken createAuthToken(String userid) throws SQLException;
    public void deleteToken(String userid) throws  SQLException;
}
