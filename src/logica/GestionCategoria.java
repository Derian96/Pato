/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.*;

/**
 *
 * @author JoeAlv
 */

public class GestionCategoria extends Conexion {
    
    public GestionCategoria () {}
    
    //  método listarcategoria
    public ResultSet listarCategorias () {
        try {
            // Nombre del procedimiento almacenado y como espera tres parametros
            String call = "{CALL ps_categoria_listar}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            rs = obj_Procedimiento.executeQuery();
                   
        } catch (SQLException e) {
            System.err.println(e);
            desconectarBD();
        } catch (Exception e) {
            System.err.println(e);
            desconectarBD();
        }
        return rs;
    }
    
    // método insertarCategoria
    public boolean insertarCategoria (Categoria categoria) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del profesor
            String call = "{CALL ps_categoria_insertar(?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setInt(1, categoria.getIdCategoria());
            obj_Procedimiento.setString(2, categoria.getNombre());
            obj_Procedimiento.setString(3, categoria.getDescripcion());
            
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
    
    // método editarCategoria 
    public boolean editarCategoria (Categoria categoria) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del profesor
            String call = "{CALL ps_categoria_editar(?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setInt(1, categoria.getIdCategoria());
            obj_Procedimiento.setString(2, categoria.getNombre());
            obj_Procedimiento.setString(3, categoria.getDescripcion());
            
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
    
    //  método eliminarCategoria  
    public boolean eliminarCategoria (int idCategoria) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del profesor
            String call = "{CALL ps_categoria_eliminar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idCategoria);
                   
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
    
    //  método buscarCategoria 
    public Categoria buscarCategoria (int idCategoria) {
        Categoria categoria = null;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del profesor
            String call = "{CALL ps_categoria_buscar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idCategoria);
            rs = obj_Procedimiento.executeQuery();
            
            if (rs.next()) {
                categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt(1));
                categoria.setNombre(rs.getString(2));
                categoria.setDescripcion(rs.getString(3));
            }
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return categoria;
    }
    
     //  método buscarIdProducto
    public boolean buscarIdCategoria (int idCategoria) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos de la Categoria
            String call = "{CALL ps_categoria_buscar_Id(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idCategoria);
            rs = obj_Procedimiento.executeQuery();
            
            
            if (rs.next()){
                if ( rs.getRow() > 0){
                rpta = true;
                }
            }
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
