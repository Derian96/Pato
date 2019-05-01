/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
*/ 

package logica;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionUsuario extends Conexion {
    
    public void login_log (String log, String iduser) throws SQLException{
        try {
            String sql = "INSERT INTO tbl_login_log (log, date, idUsuario) VALUES ('"+log+"', NOW(),'"+iduser+"')";
            conectarBD();
            ejecutar(sql);
        } catch (SQLException ex){
            desconectarBD();
        }
    }
    
    public boolean usuarioExiste (String username) throws SQLException {
        boolean rst = false;
        try {
            String sql = "SELECT * FROM tblusuarios WHERE usuario = '" + username + "'";
            conectarBD();
            ResultSet rs;
            rs = seleccionar(sql);
            rst = rs.next();
        } catch (SQLException ex){
            desconectarBD();
        }
        return rst;
    }
}
