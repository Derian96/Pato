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

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GestionProducto extends Conexion {
    
    public GestionProducto () {}
    
    //  método listarCategoriaProducto
    public ResultSet listarCategoriaProductos () {
        try {
            // N
            String call = "{CALL ps_categoria_producto_listar}";
            
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
    
    //  método listarProducto
    public ResultSet listarProductos () {
        try {
            // Nombre del procedimiento almacenado y como espera tres parametros
            String call = "{CALL ps_producto_listar}";
            
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
    
    // método insertarProducto
    public boolean insertarProducto (Producto producto) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del Producto
            String call = "{CALL ps_producto_insertar(?,?,?,?,?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setInt(1, producto.getIdProducto());
            obj_Procedimiento.setString(2, producto.getNombre());
            obj_Procedimiento.setInt(3, producto.getIdCategoria());
            obj_Procedimiento.setInt(4, producto.getExistencia());
            obj_Procedimiento.setDouble(5, producto.getPrecio());
            obj_Procedimiento.setInt(6, producto.getNivelNuevoPedido());
            obj_Procedimiento.setByte(7, (byte) producto.getSuspendido());
            
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
    
    // método editarProductos 
    public boolean editarProducto (Producto producto) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del profesor
            String call = "{CALL ps_producto_editar(?,?,?,?,?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setInt(1, producto.getIdProducto());
            obj_Procedimiento.setString(2, producto.getNombre());
            obj_Procedimiento.setInt(3, producto.getIdCategoria());
            obj_Procedimiento.setInt(4, producto.getExistencia());
            obj_Procedimiento.setDouble(5, producto.getPrecio());
            obj_Procedimiento.setInt(6, producto.getNivelNuevoPedido());
            obj_Procedimiento.setByte(7, (byte) producto.getSuspendido());
            
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
    
    //  método eliminarProducto  
    public boolean eliminarProducto (int idProducto) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del producto
            String call = "{CALL ps_producto_eliminar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idProducto);
                   
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
    
    //  método buscarProducto
    public Producto buscarProducto (int idProducto) {
        Producto producto = null;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del profesor
            String call = "{CALL ps_producto_buscar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idProducto);
            rs = obj_Procedimiento.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setIdCategoria(rs.getInt(3));
                producto.setExistencia(rs.getInt(4));
                producto.setPrecio(rs.getDouble(5));
                producto.setNivelNuevoPedido(rs.getInt(6));
                producto.setSuspendido((char) rs.getByte(7));
            }
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return producto;
    }
    
    //  método buscarIdProducto
    public boolean buscarIdProducto (int idProducto) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del producto
            String call = "{CALL ps_producto_buscar_Id(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idProducto);
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
    
    public void cargarReporteProductos2() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        
        try { 
            URL in = this.getClass().getResource("/reportes/rptProductos.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            //Se crea un objeto HashMap 
            Map parametros = new HashMap(); parametros.clear();  
            parametros.put("logo", this.getClass().getResourceAsStream("/reportes/logo.png")); 
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion()); 
            JasperViewer.viewReport(reporte_view, false);     
        } catch (JRException ex) { 
            System.err.println(ex.toString()); 
        } 
    }
    
    public void cargarReporteProductos() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        
        try { 
            URL in = this.getClass().getResource("/reportes/rptProductosConLogo.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            //Se crea un objeto HashMap 
            Map parametros = new HashMap();
            parametros.clear();  
            parametros.put("logo", this.getClass().getResourceAsStream("/img/company.png")); 
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion()); 
            JasperViewer.viewReport(reporte_view, false);     
        } catch (JRException ex) { 
            System.err.println(ex.toString()); 
        } 
    }
        
}
