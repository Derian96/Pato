/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JoeAlv
 */
public class GestionUsuario extends Conexion {
    
    
    public void login_log (String log, String iduser) throws SQLException{
        try {
        String sql = "INSERT INTO tbl_login_log (log, date, idUsuario) VALUES ('"+log+"', NOW(),'"+iduser+"')";
        conectarBD();
        ejecutar(sql);
        } catch (SQLException ex){
        }

    }
    
    public boolean checkusername (String username) throws SQLException {
        String sql = "SELECT * FROM tblusuarios WHERE usuario = '" + username + "'";
        conectarBD();
        ResultSet rs;
        rs = seleccionar(sql);
        return rs.next();
    }
}
