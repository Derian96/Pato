/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA
                                                                                                                       
    Software: Econimic Sails                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    Grupo: Javafari Team

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
 */

package logica;

import java.sql.SQLException;

public class GestionUsuario extends Conexion {
    
    public boolean usuarioExiste (String username) throws SQLException {
        boolean rst = true;
        try {
            String call = "{CALL ps_usuario_existe(?)}";
            conectarBD();
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setString(1, username);
            rs = obj_Procedimiento.executeQuery();
            rst = rs.next();
        } catch (SQLException ex){
            desconectarBD();
        }
        return rst;
    }
    
    public boolean verificarPass(String username, String password) throws SQLException 
    {
        boolean rst = true;
        
        try 
        {
            String call = "{CALL ps_usuario_password(?)}";
            conectarBD();
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setString(1, username);
            rs = obj_Procedimiento.executeQuery();
            
            if(rs.next())
            {
                
//                // Almacenamos el password registrado en la variable hashedPassword
//                String hashedPassword = rs.getString(1);
//                // Generamos el Hash de la contraseña introducida por el usuario
//                String generatedSecuredPasswordHash = (password);
//                // Validamos si las contraseñas coinciden
//                boolean matched = hashedPassword.equals(generatedSecuredPasswordHash);
//                // retornamos el resultado
                //rst = true;
            }
        } catch (SQLException ex){
            desconectarBD();
        }
        return rst;
    }
    
    
    
    // método Login_log
    public boolean Login_log(String log, int idUsuario) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            String call = "{CALL ps_login_log_insertar(?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setString(1,log);
            obj_Procedimiento.setInt(2,idUsuario);
            
           rpta = obj_Procedimiento.executeUpdate() == 1;
           
           desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
    
    // método log
    public boolean log(String log, int idUsuario) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            String call = "{CALL ps_log_insertar(?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setString(1,log);
            obj_Procedimiento.setInt(2,idUsuario);
            
           rpta = obj_Procedimiento.executeUpdate() == 1;
           
           desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
    
}
