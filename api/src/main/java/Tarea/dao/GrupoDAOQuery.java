package Tarea.dao;

/**
 * Created by esr on 29/10/15.
 */
public interface GrupoDAOQuery {

        public final static String UUID = "select REPLACE(UUID(),'-','')";
        public final static String CREATE_Grupo = "insert into Group (id, subject) values (UNHEX(?), unhex(?))";
        public final static String GET_Grupo_BY_ID = "select hex(s.id) as id, hex(s.userid) as userid, s.content, s.subject, s.creation_timestamp, s.last_modified, u.fullname from stings s, users u where s.id=unhex(?) and u.id=s.userid";
        public final static String GET_Grupo = "select hex(id) as id, hex(userid) as userid, subject, creation_timestamp, last_modified from stings";
        public final static String DELETE_STING = "delete from stings where id=unhex(?)";

}
